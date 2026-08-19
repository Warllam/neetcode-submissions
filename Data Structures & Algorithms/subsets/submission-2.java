class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList();
        List<Integer> currentSubset = new ArrayList();
        dfs(nums, 0, subsets, currentSubset);

        return subsets;
    }

    private static void dfs(int[] nums, int i, List<List<Integer>> subsets, List<Integer> currentSubset){
        if(i >= nums.length) {
            subsets.add(new ArrayList(currentSubset));
            return;
        }

        currentSubset.add(nums[i]);
        dfs(nums, i+1, subsets, currentSubset);
        currentSubset.remove(currentSubset.size()-1);
        dfs(nums, i+1, subsets, currentSubset);
    }
}
