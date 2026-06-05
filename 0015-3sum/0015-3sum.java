class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int y =nums.length-1;
        List<List<Integer>> l= new ArrayList<>();
        for(int i =0;i< y;i++){
            if (nums[i] > 0) break;
            if(i>0 && nums[i-1]==nums[i])continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int z = nums[i]+nums[j]+nums[k];
                if(z==0){
                    l.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j++],nums[k--])));
                    while(nums[k]==nums[k+1] && k>j)k--;
                    while(nums[j]==nums[j-1] && k>j)j++;
                    continue;
                }else if(z>0){
                    k--;
                    continue;
                }else{
                    j++;
                    continue;
                }
            }
        }return l;
    }
}