class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i=0; i<n; i++){ //loop iterate to count number of 0 ,1 and 2.
            if(nums[i]==0){
                countZero++;
            }
            else if(nums[i]==1){
                countOne++;
            }
            else{
                countTwo++;
            }
        }
        int k = 0; //now filling numbers as per condition 
        while(countZero>0){
            nums[k]=0;
            k++;
            countZero--;
        }
        
        while(countOne>0){
            nums[k]=1;
            k++;
            countOne--;
        }
        
        while(countTwo>0){
            nums[k]=2;
            k++;
            countTwo--;
        }
        
    }
}