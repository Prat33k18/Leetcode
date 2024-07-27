class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
    public static void main(String[]args){
        int x = 4;
        Solution s = new Solution();
        System.out.println(s.mySqrt(x));
    }
}