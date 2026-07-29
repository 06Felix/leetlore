# Explanation

## Idea

- Compute possible OR values for choosing exactly `j` elements in every prefix.
- Reverse the array, compute the same DP, then reverse the DP layers back to represent suffix choices.
- Try every split point between the first `k` chosen elements and the second `k` chosen elements.
- For each split, combine every possible left OR with every possible right OR and maximize their XOR.

## Why It Works

- The DP state `dp[i][j][x]` means some subsequence of size `j` in the prefix ending at `i` has OR value `x`.
- Each element is either skipped or included, which covers all subsequences.
- Reversing gives the same information for suffixes after each split.
- Any valid subsequence of length `2k` has a boundary between its first `k` selected elements and last `k` selected elements, so some split represents it.
- Checking all OR pairs at every split therefore covers every valid sequence value.

## Edge Cases

- Values are below `2^7`, so OR and XOR values fit in the fixed `0..128` range used by the code.
- Splits start at `k - 1` and leave at least `k` elements on the right.
- If multiple subsequences produce the same OR, the boolean state only needs to remember reachability.

## Complexity

- Time: `O(n * k * V + n * V^2)`, where `V = 129`.
- Space: `O(n * k * V)`.
