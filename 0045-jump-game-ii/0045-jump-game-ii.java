class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int max = 0;
        int cnt = 0;
        int currmax = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, i + nums[i]);
            if(i == currmax){
                cnt++;
                currmax = max;
                if(currmax >= n)break;
            }
        }return cnt;
    }
}