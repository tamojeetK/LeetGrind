class Solution {
    public int firstUniqChar(String s) {
        int index = -1;        
        int start = 0;
        int end = s.length();
        
        while(start<end){
            char ch = s.charAt(start);
            int firstIndx = s.indexOf(ch);
            int lastIndx = s.lastIndexOf(ch);
            if(firstIndx==lastIndx){
                index = start;
                break;
            }
            start++;
        }
        return index;
    }
}