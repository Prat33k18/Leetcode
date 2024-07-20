class Solution {
     public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length()-1;
        while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
           return false;
        
        }
        left ++;
        right --;
    }
    return true;
}
public static void main(String[]args){
  Solution solution = new Solution();
        int x = 121;
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
   
}
}