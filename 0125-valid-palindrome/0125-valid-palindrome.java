class Solution {
    public boolean isPalindrome(String s) {
       char[] arr = s.toCharArray();
       int left = 0;
       int right = arr.length-1;
       while(left<right){
        if(!isAlphaNumeric(arr[left])){
            left++; 
        }
        else if(!isAlphaNumeric(arr[right])){
            right--;
        }
        else{
            if(Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
       }
       return true;
    }

 

    public boolean isAlphaNumeric(char c){
        return ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'));

    }

}