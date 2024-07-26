class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for (int num : nums) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
    public static void main(String[]args){
     int[]nums={3,0,1};
     Solution s = new Solution();
     System.out.println(s.missingNumber(nums));   
    }
}
