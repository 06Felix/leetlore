# Explanation

Problem: [Reverse String](https://leetcode.com/problems/reverse-string/)

## Idea

Use two pointers, one at the start and one at the end of the array. Swap their characters and move both pointers inward until they meet.

## Why It Works

Reversing an array means the character at position `i` must move to position `n - 1 - i`. The left and right pointers always identify one such pair. Swapping them puts both characters in their final reversed positions. Moving inward processes the next pair, and when the pointers meet or cross, every position has been handled.

## Edge Cases

- A one-character array does not enter the loop and is already reversed.
- Odd lengths leave the middle character untouched, as required.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
