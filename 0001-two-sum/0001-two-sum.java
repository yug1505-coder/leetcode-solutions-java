import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        //initially hashmap empty !!
        for(int i=0; i<n; i++){
            int j = target - nums[i];
            if(map.containsKey(j)){
                return new int[]{map.get(j), i};
            }
            map.put(nums[i],i); //store curr element into hashmap when key not find in map
        }
        return new int[]{};
    }
}