class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int k = 0; //scanning pointer
        int high =  n-1;
        while(k<=high){ // equal is considered bcz we dont which element high pointer is holding so we have to consider that case also.

            if(nums[k]==0){
                int temp  = nums[low];
                nums[low] = nums[k];
                nums[k] = temp;
                low++;
                k++;
            }
            else if(nums[k]==1){
                k++;
            }
            else{ //nums[k] == 2 case
            int temp = nums[high];
            nums[high] = nums[k];
            nums[k] = temp;
            high--;
            }
        }

        
    }
}