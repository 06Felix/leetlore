# Explanation

Problem: [String Compression](https://leetcode.com/problems/string-compression/)

## Idea

Scan consecutive groups of the same character and write each compressed group back into the front of the same array.

## Why It Works

For each group, the read pointer advances until the character changes, giving the group's count. The write pointer `ans` first stores the group character. If the count is greater than one, the decimal digits of the count are written after it. This is exactly the required compressed representation for that group, and processing groups left to right creates the complete compressed prefix. Returning `ans` gives the new valid length.

## Edge Cases

- A single-character group writes only the character.
- Counts with multiple digits are split into separate characters by `String.valueOf(count).toCharArray()`.

## Complexity

- Time: `O(n)`.
- Space: `O(1)` auxiliary space, ignoring the small temporary digit string for a count.
