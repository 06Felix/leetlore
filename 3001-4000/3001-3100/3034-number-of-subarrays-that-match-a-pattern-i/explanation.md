## Idea

- Try every starting index of a length-m+1 window and test each adjacent pair against its corresponding pattern value. Stop checking a window at the first mismatch.

## Why It Works

- The pattern condition is exactly the sign of every adjacent comparison. A window is counted only when all m comparisons pass, and every possible window start is tested once.

## Edge Cases

- Equal neighbors match only zero; overlapping matching windows are counted separately.

## Complexity

- O((n−m)m) time and O(1) auxiliary space.
