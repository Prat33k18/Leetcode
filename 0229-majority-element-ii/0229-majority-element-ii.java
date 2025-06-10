class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int[] n3 = new int[nums.length];
        for(int ne : nums){
            hs.put(ne,  hs.getOrDefault(ne,0)+1);    
        }
        for(Map.Entry<Integer,Integer>entr : hs.entrySet() ){
            if(entr.getValue()>n/3){
                res.add(entr.getKey());
            }
        }
        return res;
        
        
    }
    public static void main(String[]args){
        int[]nums = {3,2,3};
        Solution s = new Solution();
        System.out.println(s.majorityElement(nums));
    }
}