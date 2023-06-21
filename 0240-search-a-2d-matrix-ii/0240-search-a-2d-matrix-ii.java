class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // Sets the value of m to the number of row
        int n = matrix[0].length; // Sets the value of n to the number of col
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}