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
         /*
        Since we know that ,
        `start` is gonna be going out of the array,
        We are gonna neutralise it by getting the remainder of the Division of 
        `start` and `length of the array`
        */
    }
}
