# Explanation

Problem: [Create Maximum Number](https://leetcode.com/problems/create-maximum-number/)

## Idea

- Try every valid split: take `i` digits from `nums1` and `k - i` digits from `nums2`.
- For each array, build the largest subsequence of the requested length with a monotonic stack.
- Merge the two subsequences by repeatedly choosing the lexicographically larger remaining suffix.
- Keep the best merged array among all splits.

## Why It Works

- For a fixed split, the monotonic-stack routine removes smaller earlier digits when a larger digit can replace them while still leaving enough digits to fill the target length.
- This produces the best subsequence for that fixed length from each source array.
- During merge, if the remaining suffix of one subsequence is lexicographically larger, choosing from it gives the largest possible next digit sequence.
- Trying every feasible split covers all ways the final `k` digits can be divided between the two input arrays.

## Edge Cases

- Splits that ask for more digits than an array contains are skipped by the loop bounds.
- If one subsequence is exhausted during merge, the comparison falls back to taking from the other one.
- Equal prefixes are resolved by looking ahead to the first differing digit.

## Complexity

- Time: up to $O(k(m+n)^2)$ in this implementation because each split can perform repeated lexicographic suffix comparisons.
- Space: $O(m + n + k)$ for chosen subsequences and the merged candidate.

## Notes

- The implementation uses `List<Integer>`, `subList`, and streams to build subsequences, which is clear but adds allocation overhead.
