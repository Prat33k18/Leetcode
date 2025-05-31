import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }

        int longestStreak = 0;

        for (int numb : s) {
            if (!s.contains(numb - 1)) {  
                int currentNum = numb;
                int currentStreak = 1;

                while (s.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Solution s = new Solution();
        System.out.print(s.longestConsecutive(nums));  
    }
}
