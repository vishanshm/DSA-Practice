class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        CS(candidates, target, 0, ans, temp);
        return ans;
    }
    private void CS(int[] nums, int target, int index, List<List<Integer>> ans, List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(target < 0 || index == nums.length)return;
        temp.add(nums[index]);
        CS(nums, target - nums[index], index + 1, ans, temp);
        temp.remove(temp.size()-1);
        index++;
        while (index < nums.length && nums[index - 1] == nums[index])index++;
        CS(nums, target, index, ans, temp);
    }
}