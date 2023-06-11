class Solution {
    public boolean isPalindrome(int x) {
        int dupX = x;
        int revX = 0;
        

        while (dupX > 0) {
            int temp = dupX % 10;
            revX = revX * 10 + temp;
            dupX = dupX/10;
        }

        if(revX==x){
            return true;
        }

        return false;
    }
}