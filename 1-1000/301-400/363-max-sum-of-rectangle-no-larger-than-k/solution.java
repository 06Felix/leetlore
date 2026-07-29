import java.util.TreeSet;
import java.util.Arrays;

class Solution {
  public int maxSumSubmatrix(int[][] matrix, int k) {
    int m = matrix.length;
    int n = matrix[0].length;
    int ans = Integer.MIN_VALUE;

    // Calculate cumulative sums for each row
    int[][] cumulativeSums = new int[m][n + 1];
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        cumulativeSums[i][j + 1] = cumulativeSums[i][j] + matrix[i][j];
      }
    }

    for (int baseCol = 0; baseCol < n; ++baseCol) {
      for (int j = baseCol; j < n; ++j) {
        // sums[i] := sum(matrix[i][baseCol..j])
        int[] sums = new int[m];
        for (int i = 0; i < m; ++i) {
          sums[i] = cumulativeSums[i][j + 1] - cumulativeSums[i][baseCol];
        }

        // Find the maximum sum <= k of all the subarrays.
        TreeSet<Integer> accumulate = new TreeSet<>(Arrays.asList(0));
        int prefix = 0;
        for (int sum : sums) {
          prefix += sum;
          Integer lo = accumulate.ceiling(prefix - k);
          if (lo != null)
            ans = Math.max(ans, prefix - lo);
          accumulate.add(prefix);
        }
      }
    }

    return ans;
  }
}
