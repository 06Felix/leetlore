# Explanation

Problem: [Count Substrings That Satisfy K-Constraint I](https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/)

## Idea

- Maintain one sliding window start for substrings with at most `k` zeroes.
- Maintain another sliding window start for substrings with at most `k` ones.
- At each right endpoint, count substrings valid by the zero constraint plus substrings valid by the one constraint.
- Subtract the overlap counted twice, where both constraints hold.

## Why It Works

- For a fixed end index, all starts from `start_0` through `end` produce substrings with at most `k` zeroes.
- Similarly, starts from `start_1` through `end` produce substrings with at most `k` ones.
- A substring is valid if it belongs to either of those two sets.
- The starts from `max(start_0, start_1)` through `end` belong to both sets and must be subtracted once.
- Summing this inclusion-exclusion count over all end indices counts every valid substring exactly once.

## Edge Cases

- Strings containing only one digit type count all substrings.
- Small `k` values are handled by advancing the matching start pointer until the count fits.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The implementation uses two separate starts rather than one combined invalid window.
