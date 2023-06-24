class Solution {
    public String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while (start < end) {
            while (start < end && !isVowel(charArr[start])) {
                start++;
            }
            while (start < end && !isVowel(charArr[end])) {
                end--;
            }
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        
        return String.valueOf(charArr);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    
    }
}