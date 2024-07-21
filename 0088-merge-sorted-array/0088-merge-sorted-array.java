import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        System.arraycopy(nums2, 0, nums1, m, n);
      
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution s = new Solution();
        s.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1)); 
    }
}
