class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i=0;
        while(i<n){
            if(nums[i]!=0){
                nums[k] = nums[i];
                k++;
                i++;
            }
            else{
            i++;}
        }
        for(int x=k; x<n; x++){ //updates every remaining index as 0 after k till n
            nums[x] = 0;
        }

        
    }
}