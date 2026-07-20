# Explanation

Problem: [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)

## Idea

Count every character. Use all even pairs in the palindrome, and add one center character if any count has an unused odd leftover.

## Why It Works

A palindrome can place characters symmetrically in pairs. For a character count `cnt`, `cnt / 2 * 2` is the largest even number of that character that can be used in mirrored positions. After summing all such even contributions, if the result is still shorter than the original string, at least one character had an odd leftover, and exactly one leftover character can be placed in the center.

## Edge Cases

- A single character returns `1`.
- Uppercase and lowercase letters are counted separately because character codes index the count array directly.

## Complexity

- Time: `O(n + 128)`, effectively `O(n)`.
- Space: `O(128)`.
