class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int startIndx = 0;
        int endIndx = arr.length-1;

        while(startIndx<endIndx){
            int midIndx = startIndx + (endIndx - startIndx)/2;

            if(arr[midIndx+1]>arr[midIndx]){
                startIndx = midIndx + 1;
            }
            if(arr[midIndx]>arr[midIndx+1]){
                endIndx = midIndx;
            }
        }

        return startIndx;
    }
}