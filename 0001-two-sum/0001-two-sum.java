class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[] { map.get(ans), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
// Time: O(n)
// You traverse the array once, and HashMap lookup/insertion is O(1) average.

// Space: O(n)
// In the worst case, you may store almost every element in the HashMap