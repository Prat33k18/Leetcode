import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
    
        Arrays.sort(nums);
        
       
        for (int i = 1; i < nums.length; i++) {
          
            if (nums[i] != nums[i - 1]) {
                
                if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        
      
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution s = new Solution();
        System.out.println(s.singleNumber(nums)); // Output will be 4
    }
}
