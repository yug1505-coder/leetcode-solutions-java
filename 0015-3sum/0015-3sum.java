class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //empty array list created to store final ans
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) { //loop till n-2 to avoid index out of range
            if (i > 0 && nums[i] == nums[i - 1]) { //i>0 bcz index st from 0
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                 if((nums[i]+nums[left]+nums[right])==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if((nums[i]+nums[left]+nums[right])>0){ //sum is already larger so right pointer will shift
                    right--;
                }
                else{//here sum is smaller so left pointer will shift
                    left++;
                }
            }
        }
        return ans; 

    }
}