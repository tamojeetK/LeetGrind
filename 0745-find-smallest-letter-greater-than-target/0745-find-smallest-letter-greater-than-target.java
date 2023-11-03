class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(letters[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return letters[start%letters.length]; 
        /*
        Since we know that ,
        `start` is gonna be going out of the array,
        We are gonna neutralise it by getting the remainder of the Division of 
        `start` and `length of the array`
        */
    }
}