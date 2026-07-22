# Explanation

Problem: [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)

## Idea

- Use DFS backtracking from the next unpartitioned index.
- Try every possible next substring starting at `start`.
- Only keep a choice if `isPalindrome` confirms that substring is valid.
- When `start` reaches the end, copy the current path into the answer.

## Why It Works

- Every valid partition is an ordered sequence of substrings that covers the string from left to right.
- At each index, the DFS tries every possible next ending position, so it considers every possible partition boundary layout.
- Non-palindrome choices are discarded immediately, so every completed path contains only palindromes.
- Backtracking removes each choice after recursion, allowing the next candidate partition to reuse the same path list safely.

## Edge Cases

- A one-character substring is always accepted by the palindrome check.
- For a string of length `1`, the DFS immediately produces the single partition.

## Complexity

- Time: $O(n^2 2^n)$ in the worst case, including palindrome checks and output construction.
- Space: $O(n)$ recursion/path space, excluding the returned partitions.

## Notes

- The implementation checks palindromes on demand instead of precomputing a DP table.
