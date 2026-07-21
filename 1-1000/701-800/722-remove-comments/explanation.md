# Remove Comments

## Idea

- Scan the source line by line and character by character.
- Track whether the scan is currently inside a block comment.
- Append normal code characters into `modified`.
- Emit `modified` as an output line only when it is non-empty and not inside a block comment.

## Why It Works

- Outside a block comment, `"/*"` starts a block and `"//"` discards the rest of the line.
- Inside a block comment, only `"*/"` matters; all other characters are ignored.
- Keeping one `StringBuilder` across lines preserves code joined by a multi-line block comment.
- Resetting it only after emitting a complete non-comment line matches newline deletion rules.

## Edge Cases

- A one-character tail at line end is appended only outside comments.
- Empty output lines are skipped.
- Comment markers inside an active block comment are ignored until the first non-overlapping close marker.

## Complexity

- Time: $O(T)$ for total source characters.
- Space: $O(T)$ for output.
