class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void helper(int[] candidate, int remaining, int index, List<Integer> current, List<List<Integer>> result){
        if(remaining == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(remaining < 0 || index == candidate.length){
            return;
        }

        for(int i=index;i<candidate.length; i++){

        current.add(candidate[i]);
        helper(candidate, remaining - candidate[i], i, current, result);
        current.remove(current.size()-1);
        }
       
       
    }

    public static void main(String[]args){
        Solution s = new Solution();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.print(s.combinationSum(candidates,target));
    }
}