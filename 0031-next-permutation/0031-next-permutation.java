class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        for(;i>=0;i--){
            if(nums[i]<nums[i+1])break;
        }if(i==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        else{
            for(int j = nums.length-1;j>i;j--){
                if(nums[j]>nums[i]){
                    swap(nums,i,j);
                    break;
                }
            }reverse(nums,i+1,nums.length-1);
        }
    }private void reverse(int[]nums,int l, int r){
        int k=1+l + (r-l)/2;
        for(int i = l;i<k;i++){
            swap(nums,l++,r--);
        }
    }private void swap(int[]nums,int l, int r ){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}