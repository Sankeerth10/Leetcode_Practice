class Solution {
    
    public void combinationSum(int index, int [] candidates, int target, List<List<Integer>> res, ArrayList<Integer> ds) {
        //base case
        if(index == candidates.length) {
            if(target == 0) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            combinationSum(index, candidates, target - candidates[index], res, ds);
            //This is for backtracking as ledt recurssion is finished first 
            ds.remove(ds.size() -1);
        }
        combinationSum(index+1, candidates, target, res, ds);   
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(0, candidates, target, res, new ArrayList<Integer>());
        return res;
    }
}