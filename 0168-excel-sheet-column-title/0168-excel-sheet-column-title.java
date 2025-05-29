class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb =  new StringBuilder();

        while(columnNumber>0){
            columnNumber --;
            int rem = columnNumber % 26;
            char ch = (char) (rem+'A');
            sb.append(ch);
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[]args){
        int columnNumber = 777;
        Solution s = new Solution();
        System.out.print(s.convertToTitle(columnNumber));
    }
}