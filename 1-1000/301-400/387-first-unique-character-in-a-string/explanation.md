# Explanation

Problem: [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

## Idea

- Count occurrences of each lowercase letter in a fixed array of size 26.
- Scan the string a second time from left to right.
- Return the first index whose character count is exactly one.

## Why It Works

- The first pass records the total frequency of every possible character.
- During the second pass, the first character with frequency one is the earliest non-repeating character by index order.
- If no such character is found, every character repeats and the correct result is `-1`.

## Edge Cases

- A string with all repeated characters returns `-1`.
- A single-character string returns index `0`.
- The fixed array is valid because the input contains only lowercase English letters.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
