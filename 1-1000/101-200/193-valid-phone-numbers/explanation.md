# Valid Phone Numbers

## Idea

- The solution uses `grep` with two regular expressions.
- The first expression matches `xxx-xxx-xxxx`.
- The second expression matches `(xxx) xxx-xxxx`.
- Both expressions are anchored with `^` and `$` so the whole line must match.

## Why It Works

- `[0-9]\{3\}` requires exactly three digits in basic regular expression syntax.
- Escaped hyphens match literal separators.
- The parenthesized format explicitly requires parentheses around the first three digits and one space before the next group.
- `grep -e ... -e ...` prints lines matching either valid format.

## Edge Cases

- Lines with extra characters, missing digits, or wrong separators are rejected by the anchors.
- Leading or trailing spaces are not accepted, matching the problem statement.
- Each input line is tested independently by `grep`.

## Complexity

- Time: $O(L)$ over the total input length.
- Space: $O(1)$ besides `grep`'s internal processing.
