## Idea

- Use descending 0/1 knapsack over distinct powers i^x.

## Why It Works

- Processing each power once and iterating sums downward counts each set of bases exactly once.

## Edge Cases

- dp[0]=1 represents choosing no powers; sums that cannot be formed remain zero.

## Complexity

- O(n·n^(1/x)) time and O(n) space.

## Notes

- The stored DP reduces modulo MOD only at the end; it relies on its intermediate long sums staying within range for the constraints.
