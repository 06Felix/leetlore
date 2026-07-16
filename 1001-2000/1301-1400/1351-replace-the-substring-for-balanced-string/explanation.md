# Replace the Substring for Balanced String

## Idea

- The implementation counts all characters first.
- It uses a sliding window as the substring that will be replaced.
- Expanding the right side removes characters from the outside count.
- While the outside counts for `Q`, `W`, `E`, and `R` are all at most `n / 4`, the window is a valid replacement candidate and the left side is shrunk.

## Why It Works

- Only characters outside the replaced substring must already fit within the balanced limit.
- If each outside count is at most `n / 4`, the replacement substring can supply the missing characters.
- Sliding the window over all positions considers every possible substring.
- Shrinking while valid keeps the shortest valid window ending at the current right boundary.

## Edge Cases

- Already balanced strings eventually allow a zero-length replacement through the shrink step.
- Extra copies of any one character are handled by requiring all four outside counts to be within limit.
- The string length is a multiple of four, so `len / 4` is the exact target count.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
