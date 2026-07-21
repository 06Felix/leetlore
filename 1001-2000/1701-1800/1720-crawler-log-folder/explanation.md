# Crawler Log Folder

## Idea

- Track current folder depth from the main folder.
- `"../"` decreases depth, but not below zero.
- `"./"` leaves depth unchanged.
- Any other log enters a child folder and increases depth.

## Why It Works

- The minimum operations to return to main is exactly the current depth.
- Parent moves cancel one child move when depth is positive.
- Main-folder parent moves have no effect, handled by `max(0, ans - 1)`.
- Child folder operations add one level.

## Edge Cases

- Repeated `"../"` at root keeps depth `0`.
- `"./"` entries are ignored.
- Folder names do not need parsing because every non-special log is a child move.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
