// Time Complexity: O(log(mn))
// Space Complexity: O(1)

class Solution {

    public int getRow(int mid, int rowLength) {
        return mid / rowLength; 
    }

    public int getCol(int mid, int rowLength) {
        return mid % rowLength;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        
        int colLength = matrix.length;
        int rowLength = matrix[0].length;

        int low = 0;
        int high = (rowLength * colLength) - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            int row = getRow(mid, rowLength);
            int col = getCol(mid, rowLength);

            if(matrix[row][col] == target) {
                return true;
            }

            if(target > matrix[row][col]) {
                low = mid + 1;
            } else if(target < matrix[row][col]) {
                high = mid - 1;
            }

        }

        return false;
    }
}
