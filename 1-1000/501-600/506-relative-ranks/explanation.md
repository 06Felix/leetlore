# Explanation

Problem: [Relative Ranks](https://leetcode.com/problems/relative-ranks/)

## Idea

Copy and sort the scores in ascending order. For each original score, binary search its sorted position and convert that position into a descending rank.

## Why It Works

Scores are unique, so each score has one index in the sorted copy. If a score is at ascending index `p`, then exactly `n - p - 1` scores are larger, so its rank is `n - p`. The implementation maps ranks `1`, `2`, and `3` to medal strings and uses the decimal rank for all remaining athletes.

## Edge Cases

- `n < 3` naturally uses only the medal cases that exist.
- Unique scores avoid ties and make `Arrays.binarySearch` unambiguous.

## Complexity

- Time: `O(n log n)` for sorting plus `O(n log n)` binary searches.
- Space: `O(n)` for the sorted copy and answer array.
