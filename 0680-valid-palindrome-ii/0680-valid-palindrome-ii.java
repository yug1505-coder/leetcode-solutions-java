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
                return isValid(arr,left+1,right)||isValid(arr,left,right-1);
            }
        }
        return true;
    }

    public boolean isValid(char[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            } else {
                left++;
                right--;
            }
        }
            return true;

    }
}

//TC - O(n+n/2) --> O(n)
//SC - O(n) char arr