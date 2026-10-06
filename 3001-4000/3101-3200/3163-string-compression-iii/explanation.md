# Explanation

## Idea
- Scan the character array from left to right, taking at most nine equal characters per chunk.
- Append the chunk's count followed by its character, then continue from the first unconsumed position.

## Why It Works
- The inner loop stops exactly at a character change, the end of input, or the nine-character cap.
- Each chunk is therefore the maximum permitted identical-character prefix of the remaining input.
- Advancing to its endpoint consumes each character once and applies the required encoding in order.

## Edge Cases
- A run longer than nine is split into successive chunks; a run of exactly nine produces one chunk.
- Single characters and alternating characters each produce count-one chunks.

## Complexity
- Time: $O(n)$ for input length `n`.
- Space: $O(n)$ for the character array and output builder; the returned string can have up to twice the input length.
