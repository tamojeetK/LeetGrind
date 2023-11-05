class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex < endIndex){
            int mid = startIndex + (endIndex - startIndex) / 2;

            // We check if the [mid] element is greater than [mid + 1] -> end = mid
            if(arr[mid] > arr[mid+1]){
                endIndex = mid;
            }
            // We check if the [mid] element is smaller than [mid + 1] -> start = mid + 1
            else {
                startIndex = mid+1;
            }
        }
        // Eventually both the pointers would point on the same element, which turns
        // out to be the Peak element
        return startIndex;
    }
}