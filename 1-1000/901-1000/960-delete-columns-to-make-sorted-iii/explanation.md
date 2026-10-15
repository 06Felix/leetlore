# Delete Columns to Make Sorted III

## Idea

- Find the longest subsequence of columns that is nondecreasing in every row. Let dp[i] be its maximum length ending at column i; extend from an earlier column j only when every row satisfies strs[row][j] <= strs[row][i]. Return total columns minus the best length.

## Why It Works

- Any valid retained column sequence must satisfy this componentwise condition between consecutive retained columns. The DP tries every possible predecessor, so it finds the maximum number of columns that can remain; deleting all other columns is minimal.

## Edge Cases

- One column always remains valid. Equal characters permit extension, and a single row reduces to a longest nondecreasing subsequence problem.

## Complexity

- O(rows * cols^2) time and O(rows * cols + cols) auxiliary space, including copied character arrays.

## Notes

- The required order is within each row, not between row strings. The original strings are unchanged.
