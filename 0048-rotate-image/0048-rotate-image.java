class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length-1; i++){
            for (int j = i+1 ; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }reverse(matrix[i]);
        }reverse(matrix[matrix.length-1]);
    }private void reverse (int []arr){
        for (int i = 0 ; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}