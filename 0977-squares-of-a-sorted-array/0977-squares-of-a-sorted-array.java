class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n-1;
        while(left<=right){
            if((nums[left]*nums[left])<(nums[right]*nums[right])){
                ans[n-1] = nums[right]*nums[right];
                right--;
                n--;
            }
            else{
               ans[n-1] = nums[left]*nums[left];
                left++;
                n--;
            }
        }
        return ans;
    }
}