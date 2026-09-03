class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while(left<right && !isAlphaNumeric(arr[left])) {
                left++;
            }
            while(left<right && !isAlphaNumeric(arr[right])) {
                right--;
            }
            if(Character.toLowerCase(arr[left])!= Character.toLowerCase(arr[right])){
                return false;
            }
            else{
                left++;
                right--;
            }
        }


        return true;

    }

    public boolean isAlphaNumeric(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
}
// TC: You can think of the two-pointer comparison as roughly O(n/2), because pointers move toward each other. But Big-O drops the constant 1/2, so we write O(n).
// SC: O(n) because s.toCharArray() creates a new char[] containing the characters.