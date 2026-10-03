class Solution {
    public int trap(int[] height) {
        if(height==null || height.length<3){
            return 0;
        }
        int l = 0;
        int r = height.length-1;
        int lMax = 0;
        int rMax = 0;
        int totalWater = 0;
    
    while(l<r){
        if(height[l]<height[r]){
            if(height[l]>=lMax){
                lMax= height[l];
            }
            else{// if old left max small, then water will store.
            totalWater += lMax - height[l];
            }
            l++;
        }
        else{//height[r]>height[l]
        if(height[r]>=rMax){
            rMax = height[r];
        }
        else{//old rMax greater so water will store.
            totalWater += rMax - height[r];
        }
        r--;

        }
    }
    return totalWater;
        
    }
}