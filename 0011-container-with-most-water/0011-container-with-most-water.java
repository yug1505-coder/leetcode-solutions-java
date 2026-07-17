class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea= 0;
        while(left<right){
            int minHeight = Math.min(height[left],height[right]);
            int width = right-left;
            int area= minHeight*width;
            maxArea = Math.max(area,maxArea); //updating maxArea
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxArea;

        
    }
}