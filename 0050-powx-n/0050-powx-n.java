class Solution {
    static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            long absN = -(long) n;
            return power(x, absN);
        }

        return power(x, n);
    }

    static double power(double x, long n) {
        double pow = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                pow *= x;
            }
            x *= x;
            n /= 2;
        }

        return pow;
    }
}
