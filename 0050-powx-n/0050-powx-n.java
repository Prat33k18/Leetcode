class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
    public static void main(String[]args){
            double x = 2.10000;
             int n = 10;

        Solution s = new Solution();
        System.out.println(s.myPow(x,n));
    }
}