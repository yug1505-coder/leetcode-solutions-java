class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k =1;
        int i=1;
        while(i<n){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
                i++;
            }
            else{
                i++;
            }
        }
        return k;
        
    }
}