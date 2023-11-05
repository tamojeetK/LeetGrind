class Solution {
    public boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        //walking up...
        while( i + 1 < N && arr[i] < arr[i+1] ) {
            i++; //go up
        }
        //after reaching the peak,
        //check 
        if(i == 0 || i == N-1){
            return false;
        }
        //walking down...
        while( i + 1 < N && arr[i] > arr[i+1] ) {
            i++;
        }  

        return i == N-1; //return whether i has reached the end of the Array or not.

        //if i == end of the arr, it will retun True
        //else False

    }
}