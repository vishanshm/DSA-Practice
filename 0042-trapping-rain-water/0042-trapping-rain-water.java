class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int rightmax = 0, leftmax = 0;
        int total = 0;
        while(left < right){
            if (height[left] <= height[right]){
                if (leftmax > height[left]){
                    total += leftmax - height[left];
                }
                else leftmax = height[left];
                left += 1;
            }else {
                if(rightmax > height[right]){
                    total += rightmax - height[right];
                }else rightmax = height[right];
                right -= 1;
            }
        }return total;
    }
}