class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }
            char[] arr = s.toCharArray();
            int low = 0, high =0; // will hold longest palindrome indices 
            for(int i=0; i<arr.length; i++){
            int odd = expand(arr,i,i);
            int even = expand(arr,i,i+1);
            int maxLen = Math.max(odd,even);
            if(maxLen>(high-low+1)){ //if maxlen changed low and high also changed..
                low = i-(maxLen-1)/2;
                high = i+(maxLen)/2;
            }
            }
            return s.substring(low,high+1);

        }
    private int expand(char[] arr, int left, int right){
        while(left>=0 && right<arr.length && arr[left]==arr[right]){
            left--;
            right++;
        }
        //when we came out of loop so pointers moved out already outside either left,right or both so to bring up correct length within arr boundaries we done this,so in order to calculate the correct maxLen...
        return right-left-1;
    }
}
//TC - O(n^2)
//SC - O(n)