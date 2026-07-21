# Number of Lines To Write String

## Idea

- Track `numLines` and `runningWidth` for the current line.
- For each character, look up its width.
- If it fits within `100`, add it to the current line.
- Otherwise, start a new line with that character's width.

## Why It Works

- The writing process is greedy: each line takes as many letters as possible before moving on.
- A character starts a new line exactly when adding it would exceed width `100`.
- `runningWidth` always stores the width of the last line after processing each character.
- `numLines` is incremented once for each wrap.

## Edge Cases

- If all letters fit, the result is one line.
- A character with width exactly filling the line stays on that line.
- Widths are at most `10`, so any single character fits on an empty line.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
