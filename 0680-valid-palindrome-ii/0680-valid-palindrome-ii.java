class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                //either left pointer will move or right will move 
                return checkPalindrome(s,left+1,right) || 
                checkPalindrome(s,left,right-1);
            }
        }
        return true;
        
    }
    public boolean checkPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
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
// O(n) + O(n) + O(n) = O(3n)
// Big-O mein constant 3 ignore
// O(3n) → O(n) 
// Space: O(1) because no extra char array.