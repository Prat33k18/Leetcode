class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filteredString = new StringBuilder();

        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }

       
        int left = 0;
        int right = filteredString.length() - 1;

        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(s);
        System.out.println(result);  
    }
}
