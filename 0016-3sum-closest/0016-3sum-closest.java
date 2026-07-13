class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int result = 0; //closest sum hold krega
        int minDiff = Integer.MAX_VALUE; // smallestt diff store 
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(diff<minDiff){
                    minDiff = diff;
                    result = sum; //closest sum
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{ //sum==target
                return sum;
                }
            }
        }
        return result; 


        
    }
}