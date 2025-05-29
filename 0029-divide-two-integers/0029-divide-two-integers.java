class Solution { 
    public int divide(int dividend, int divisor) {
       if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = dividend;
        long b = divisor;
        long ans = 0;

        boolean negative = false;

        if (a < 0) {
            negative = !negative;
            a = -a;
        }
        if (b < 0) {
            negative = !negative;
            b = -b;
        }

        ans = a / b;

        if (negative) {
            ans = -ans;
        }

        return (int) ans;
    }
    public static void main(String[]args){
        int dividend = 10;
        int divisor = 3;
        Solution s =  new Solution();
        System.out.print(s.divide(dividend, divisor));
    }
}