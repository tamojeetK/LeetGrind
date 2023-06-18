class Solution {
    public int findPeakElement(int[] nums) {
        int startIndx = 0;
        int endIndx = nums.length-1;

        while(startIndx<endIndx){
            int midIndx = startIndx + (endIndx-startIndx)/2;

            if(nums[midIndx]<nums[midIndx+1]){
                startIndx = midIndx+1;
            }

            if(nums[midIndx]>nums[midIndx+1]){
                endIndx = midIndx;
            }
        }

        return startIndx;
    }
}