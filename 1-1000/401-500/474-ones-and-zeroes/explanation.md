# Ones and Zeroes

## Idea

- Count zeroes and ones in each string. Update a two-dimensional budget DP in descending zero and one order, choosing between skipping the string and taking it once.

## Why It Works

- dp[i][j] stores the largest subset within the two budgets. Taking the current string leaves budgets i - zeroes and j - ones; descending iteration reads the previous item layer and prevents selecting the same string repeatedly.

## Edge Cases

- Strings exceeding either budget are skipped by the loop bounds. A string using only one digit still cannot be reused because the budget it consumes is traversed in descending order.

## Complexity

- O(total characters + strings.length * m * n) time. O(m * n + L) working space, including the temporary toCharArray() for maximum string length L.

## Notes

- The input strings remain unchanged; identical strings at different indices are separate selectable items.
