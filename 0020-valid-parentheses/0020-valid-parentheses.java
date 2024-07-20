class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            char current = c[i];
            
           
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
               
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();  
                if ((current == ')' && top != '(') ||
                    (current == ']' && top != '[') ||
                    (current == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
      
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        Solution sol = new Solution();
        boolean result = sol.isValid(s);
        System.out.println(result);    
    }
}
