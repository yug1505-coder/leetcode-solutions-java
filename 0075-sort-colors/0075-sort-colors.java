class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, k = 0;
        while (k<=right) {
            // equal is considered bcz we dont which element high pointer is holding so we have to consider that case also.
            if (nums[k] == 0) {
                int temp = nums[left];
                nums[left] = nums[k];
                nums[k] = temp;
                left++;
                k++;
            }
            else if(nums[k]==1){
                k++; 
            }
            else{
                int temp = nums[right];
                nums[right]= nums[k];
                nums[k] = temp;
                right--;
                //k++ not done bcz after right swapping , we dont know  current element which is placed at k so we need to check it..
            }
        }

    }
}
// TC: O(n)
// SC: O(1)