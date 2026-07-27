# Explanation

## Idea

Uncrossed matching lines are equivalent to a longest common subsequence between the two arrays. The implementation uses `dp[i][j]` for the best line count using the first `i` elements of `nums1` and first `j` elements of `nums2`.

## Why It Works

If `nums1[i - 1] == nums2[j - 1]`, those two endpoints can be matched after any optimal solution for the previous prefixes.

If they differ, the optimal solution must skip one of those endpoints, so it takes the better of the two smaller prefix states.

Since the DP only matches elements in order, the produced lines cannot cross.

## Edge Cases

- Arrays with no common value return `0`.
- Equal duplicate values are counted through separate prefix states.
- The zero row and column cover empty prefixes.

## Complexity

Time: `O(m * n)`.

Space: `O(m * n)`.
