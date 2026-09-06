class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }
            else{
                //either left pointer will move or right will move 
                return checkPalindrome(arr,left+1,right) || 
                checkPalindrome(arr,left,right-1);
            }
        }
        return true;
        
    }
    public boolean checkPalindrome(char[] arr, int left, int right){
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
// Time: O(n) — first pass + at most two helper checks, O(n)
// Space: O(n) because toCharArray() creates a char array.