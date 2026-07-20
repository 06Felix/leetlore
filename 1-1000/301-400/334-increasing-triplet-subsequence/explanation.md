# Explanation

Problem: [Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/)

## Idea

Track the smallest possible first value and the smallest possible second value of an increasing pair seen so far. If a later number is larger than both, an increasing triplet exists.

## Why It Works

`first` stores the best smallest starting value. `second` stores the best smallest value that can follow some earlier `first`. When a number is at most `first`, it improves the first candidate. When it is greater than `first` but at most `second`, it improves the second candidate. Any number greater than `second` completes `first < second < num` in index order, so the method can return `true`.

## Edge Cases

- Descending arrays keep lowering `first` and never form a triplet.
- Equal values do not count because the checks use `<=` before accepting a larger stage.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
