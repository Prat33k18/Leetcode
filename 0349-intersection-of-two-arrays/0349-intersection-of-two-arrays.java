class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0, p2 = 0, k = 0;
        int[] intersection = new int[Math.min(nums1.length, nums2.length)];

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else if (k == 0 || intersection[k - 1] != nums1[p1]) {
                    intersection[k++] = nums1[p1];
                }
                p1++;
                p2++;
            }
        

     return Arrays.copyOfRange(intersection, 0, k);
    }
    public static void main(String[]args){
        int[]nums1={1,2,2,1};
        int[]nums2 = {1,2,2,1};
        Solution s= new Solution();
        int[] intersection = s.intersection(nums1, nums2); 
        for(int num:intersection)
        System.out.println(s.intersection(nums1,nums2));
    }
}