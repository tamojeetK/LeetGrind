class Solution {
    public int reverse(int x) {
        int y = x;
        long ans = 0;
        while(y!=0){
            int temp = y%10;
            ans = ans*10+temp;
            y=y/10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }
}