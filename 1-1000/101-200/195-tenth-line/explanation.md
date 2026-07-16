# Tenth Line

## Idea

- The script reads `file.txt` line by line with `read`.
- It tracks the current line number in `count`.
- When `count == 10`, it prints the current line and stops.
- Otherwise it increments the counter and continues.

## Why It Works

- Reading sequentially preserves the file's line order.
- The counter starts at `1`, so the tenth successful read corresponds to line 10.
- Breaking after printing avoids reading unnecessary later lines.
- If the loop ends before `count` reaches 10, nothing is printed.

## Edge Cases

- Files with fewer than 10 lines produce no output.
- A file with exactly 10 lines prints the last line.
- `IFS= read -r` preserves leading spaces and backslashes while reading.

## Complexity

- Time: $O(\min(n, 10))$ lines read.
- Space: $O(1)$.
