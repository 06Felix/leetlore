# Long Pressed Name

## Idea

- Scan `typed` while tracking how many characters of `name` have been matched.
- If the current typed character matches the next needed name character, advance the name pointer.
- Otherwise, the typed character must equal the previous typed character to be a valid long press.

## Why It Works

- Every character in `name` must appear in order in `typed`.
- Extra characters are allowed only when they repeat the previous typed character, representing a long press.
- After scanning `typed`, all of `name` must have been matched.

## Edge Cases

- Extra characters at the start are invalid because there is no previous typed character to long-press.
- Repeated groups in `typed` can cover a single character in `name`.
- Missing any name character leaves the pointer short and returns `false`.

## Complexity

- Time: `O(t)`, where `t` is `typed.length()`.
- Space: `O(1)`.
