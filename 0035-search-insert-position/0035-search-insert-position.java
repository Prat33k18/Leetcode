class Solution {
    public int searchInsert(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return low;
    }
    public static void main(String[]args){
        int[] nums = {1,3,5,6};
        int target = 5;
        Solution s = new Solution();
        System.out.print(s.searchInsert(nums,target));
    }
}