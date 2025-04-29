class Solution {
    public int maximumCount(int[] nums) {
        int negcount =0;
        int poscount =0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                poscount++;
            }
            if(nums[i]<0){
                negcount++;
            }
            result = Math.max(poscount,negcount);
        }
        return result;
    }
    public static void main(String[]args){
              int [] nums = {-2,-1,-1,1,2,3};
              Solution s = new Solution();
              System.out.println(s.maximumCount(nums));
    }
}