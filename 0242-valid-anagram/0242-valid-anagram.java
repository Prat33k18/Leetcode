class Solution {
    public boolean isAnagram(String s, String t) {
    
        if (s.length() != t.length()) {
            return false;
        }
    
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> ht = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
            ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i), 0) + 1);
        }

        
        return hs.equals(ht);
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(sol.isAnagram(s,t));
    }
}
