# Explanation

## Idea

- For `n = 1`, return the known best product `9`.
- For larger `n`, iterate the left half of an even-length palindrome from the largest `n`-digit value downward.
- Mirror that left half to build a palindrome candidate, then test whether it has an `n`-digit factor.
- The first candidate that factors into two `n`-digit numbers is the largest valid palindrome.

## Why It Works

- Checking palindrome prefixes from largest to smallest visits candidates in descending order.
- Any even-length palindrome built by the implementation is exactly a prefix followed by its reverse.
- For a candidate, trying factors from the maximum `n`-digit value while `j * j >= cand` covers all possible factor pairs without checking both sides twice.
- Returning on the first valid divisor therefore returns the largest product palindrome, then applies modulo `1337`.

## Edge Cases

- Single-digit input is handled separately.
- The lower prefix bound keeps generated factors in the `n`-digit range.
- The fallback return is only reached if no candidate is found in the loop.

## Complexity

- Time: bounded by the prefix and factor search; acceptable for fixed `n <= 8`.
- Space: `O(n)` for reversing the decimal prefix.
