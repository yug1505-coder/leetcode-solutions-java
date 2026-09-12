class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){ //same element again found so skipp 
                continue;
            }
            if(nums[i]>0){ // sum can't b greater than zero ever !
                break;
            }
            int left = i+1, right = n-1;
            while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                //initially first moved the pointers...
                left++;
                right--;

                //conditons for duplicate elements when left and right pointer moved and new element same as previous one..

                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }

            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
            }
        }
        return ans;
    }
}

// total time - O(nlogn) for sorting + O(n square) == O(n square) !
// total space  - if we exclude the memory used by the output arraylist (which is required by the problem), the Auxiliary Space is O(1).