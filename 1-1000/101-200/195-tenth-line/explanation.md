# Explanation

## Idea

- Read `file.txt` line by line with a shell `while read` loop.
- Keep a 1-based `count` for the current line.
- When `count` reaches 10, print that line and stop reading.

## Why It Works

- The loop visits lines in file order, so the first line seen with `count == 10` is exactly the tenth line.
- Breaking immediately after printing avoids any dependence on later file contents.
- If the file has fewer than ten lines, the condition is never reached and nothing is printed.

## Edge Cases

- Files with fewer than ten lines produce no output.
- `IFS= read -r` preserves leading/trailing whitespace and backslashes while reading.

## Complexity

- Time: $O(\min(n, 10))$ lines read before stopping.
- Space: $O(1)$ extra space.
