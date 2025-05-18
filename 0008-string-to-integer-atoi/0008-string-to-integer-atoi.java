class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) 
        return 0;
       int i=0;
        int sign =1;
        long res =0;
     if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

      while(i<s.length() && Character.isDigit(s.charAt(i))){
        res = res* 10 + (s.charAt(i) -'0');
        if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -res< Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
      }
      return (int) (sign*res);
    }
    public static void main(String[]args){
        String s = "-42";
        Solution sub = new Solution();
        sub.myAtoi(s);
    }
}