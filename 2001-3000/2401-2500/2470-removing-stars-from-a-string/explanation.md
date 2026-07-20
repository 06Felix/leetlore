# Explanation

Problem: [Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/)

## Idea

Use a `StringBuilder` as a stack of surviving characters. Letters are appended; a star removes the most recent surviving letter.

## Why It Works

The operation removes each star and the closest non-star character to its left. The closest surviving non-star is exactly the last character currently stored in the builder. Therefore deleting the builder's last character when a star is seen simulates the required operation. Non-star characters are appended in order, so the builder contents after the scan are the final string.

## Edge Cases

- Inputs are guaranteed valid, so every star has a previous character to delete.
- If all characters are removed, the builder returns an empty string.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the builder.
