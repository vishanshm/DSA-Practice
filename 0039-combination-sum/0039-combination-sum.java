class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        CS(0, ans, temp, candidates, target);
        return ans;
    }
    private void CS(int index, List<List<Integer>> ans, List<Integer> temp, int[] nums, int target){
        if (target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }if(target < 0 || index >= nums.length) return;
        temp.add(nums[index]);
        CS(index, ans, temp, nums, target - nums[index]);
        temp.remove(temp.size()-1);
        CS(index + 1, ans, temp, nums, target);
    }
}