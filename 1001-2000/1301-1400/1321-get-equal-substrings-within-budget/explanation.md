# Explanation

Problem: [Get Equal Substrings Within Budget](https://leetcode.com/problems/get-equal-substrings-within-budget/)

## Idea

Use a sliding window over the per-character conversion costs. Expand the right end each step and shrink the left end when the running budget becomes negative.

## Why It Works

Subtracting `abs(s[i] - t[i])` adds the new right character to the current window cost. If the budget becomes negative, removing the leftmost cost restores the invariant that the tracked window is affordable after at most one left shift. Since the right pointer advances through all positions and the left pointer only moves forward, the final `s.length() - j` equals the maximum maintained window length under this compact sliding-window form.

## Edge Cases

- `maxCost = 0` still allows runs of equal characters.
- If every single conversion is too expensive, the maintained window can shrink to length `0`.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
