# Explanation

Problem: [Find the Sum of the Power of All Subsequences](https://leetcode.com/problems/find-the-sum-of-the-power-of-all-subsequences/)

## Idea

Use memoized recursion over index `i` and remaining target sum `j`. For each number, either put it into the inner subsequence whose sum must reach `k`, or leave it out of that inner subsequence.

## Why It Works

The answer counts pairs `(inner, outer)` where `inner` is a subsequence of `outer` and `sum(inner) = k`. At each index, if the number is included in `inner`, the remaining target decreases by that value. If it is not included in `inner`, it still has two choices: absent from `outer`, or present only in `outer`; that creates the `2 * skip` term. Once `j == 0`, every remaining element can independently be absent or present only in `outer`, giving `2^(remaining)` completions. Memoization ensures each `(i, j)` state is solved once.

## Edge Cases

- If `j` becomes negative, the branch contributes `0`.
- If all numbers are processed before reaching `0`, the branch contributes `0`.
- Modular exponentiation is used for the remaining free choices.

## Complexity

- Time: `O(nk log n)` from `n * k` memo states and repeated exponentiation at successful base states.
- Space: `O(nk)` for memoization plus `O(n)` recursion stack.
