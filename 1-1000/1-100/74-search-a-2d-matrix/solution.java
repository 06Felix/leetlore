class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0, r = rows - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[mid][0] <= target && matrix[mid][cols - 1] >= target) {
                int result = Arrays.binarySearch(matrix[mid], target);
                if (result >= 0)
                    return true;
            }
            if (matrix[mid][cols - 1] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }
}
