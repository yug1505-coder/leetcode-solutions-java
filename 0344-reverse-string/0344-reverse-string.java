class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0, right = n-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        
    }
}
// TC = O(n/2) because left aur right each iteration mein ek step andar aate hain.
// But Big-O mein constant factor ignore hota hai, so O(n/2) = O(n).
// SC = O(1) because sirf temp, left, right, etc. constant extra variables hain.