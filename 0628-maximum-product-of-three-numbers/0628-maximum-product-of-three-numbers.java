class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int pro = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
       int pro2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(pro,pro2);
    }
    public static void main(String[]args){
        Solution s = new Solution();
        int[] nums = {1,2,3};
        System.out.print(s.maximumProduct(nums));
    }
}