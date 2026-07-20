# Explanation

Problem: [Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/)

## Idea

Two close strings must have the same set of characters and the same multiset of character frequencies. Count both strings, compare character presence, then sort and compare the frequency arrays.

## Why It Works

Swapping characters can reorder a string arbitrarily but cannot change character counts. The second operation can swap the identities of two existing characters, so frequencies can be reassigned among characters, but no new character can appear and no existing character can disappear. Therefore both strings are close exactly when their present character sets match and their frequency multisets match. The implementation checks presence before sorting, then compares sorted frequency arrays.

## Edge Cases

- Different lengths return `false` immediately.
- A character appearing in only one string returns `false` even if frequencies could otherwise match.

## Complexity

- Time: `O(n + 26 log 26)`, effectively `O(n)`.
- Space: `O(26)`.
