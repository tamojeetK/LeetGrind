class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int startIndx = 0;
        int endIndx = letters.length-1;
        while(startIndx<=endIndx){
             int mid = startIndx + (endIndx-startIndx)/2;

            if(target<letters[mid]){
                endIndx = mid-1;
            }
            else{
                startIndx = mid+1;
            }
        }
        return letters[startIndx % letters.length];
        
    }
}