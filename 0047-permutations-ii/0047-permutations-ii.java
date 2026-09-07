class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        backtrack(nums, visit, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] nums, boolean[] visit,List<Integer> curr,List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !visit[i - 1]) {
                continue;
            }
            visit[i] = true;
            curr.add(nums[i]);
            backtrack(nums, visit, curr, res);
            visit[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}