class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args){
        Solution s= new Solution();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.print(s.findKthLargest(nums,k));
    }
}