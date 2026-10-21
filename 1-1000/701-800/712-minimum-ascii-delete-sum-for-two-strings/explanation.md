# Minimum ASCII Delete Sum for Two Strings

## Idea

- Use dp[i][j] for the minimum deletion cost to equalize the first i and j characters. Initialize empty-prefix costs by deleting every character. Equal final characters extend the diagonal for free; otherwise delete either final character and take the cheaper result.

## Why It Works

- If the final characters differ, at least one must be deleted, and the two transitions cover both choices. If they match, keeping that shared final character can attain an optimum because deletion costs are nonnegative. Induction over prefix lengths therefore gives the minimum total cost.

## Edge Cases

- An empty prefix requires deleting the other prefix completely. Repeated characters and unequal string lengths are handled by the same recurrence.

## Complexity

- O(m * n) time and O(m * n) space.

## Notes

- For lowercase English input, Java char values equal their ASCII codes. The input strings are unchanged, and all costs fit int under the length bounds.
