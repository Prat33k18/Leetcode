class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int summery = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
               summery += nums[i];
                
            }else{
                sum = Math.max(sum,summery);
                summery = nums[i];
            }
            }
        
        return Math.max(sum,summery);
    }
    public static void main(String[]args){
        int[] nums = {12,17,15,13,10,11,12};
        Solution s =new Solution();
        System.out.print(s.maxAscendingSum(nums));
    }
}