class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i = 0;
   while(i<n){
            if(nums[i]!=0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i]= temp;
                k++;

            }
            i++;
   }
    }
}
// Time Complexity: O(n) — i array ko exactly once traverse karta hai. k bhi maximum n times move karta hai, so overall linear.
// Space Complexity: O(1) — sirf i, k, temp jaise constant extra variables use ho rahe hain; koi extra array/data structure nahi.