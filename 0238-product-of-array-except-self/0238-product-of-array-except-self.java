class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] leftHandSide = new int[n];
        int[] rightHandSide = new int[n];
        
        //initialize the arrays
        leftHandSide[0] = 1;
        rightHandSide[n-1] = 1;
        
        //--> [1,_,_,_] [_,_,_,1]
        
        // leftHandSide        
        for(int i=1; i<n; i++){
            leftHandSide[i] = leftHandSide[i-1] * nums[i-1];
        }
        
        // rightHandSide
        for(int i=n-2; i>=0; i--){
            rightHandSide[i] = rightHandSide[i+1] * nums[i+1];
        }
        
        int[] productExceptSelf = new int[n];
        for(int i=0; i<n; i++){
            productExceptSelf[i] = leftHandSide[i] * rightHandSide[i];   
        }
        
        return productExceptSelf;
    }
}