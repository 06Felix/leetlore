# Positions of Large Groups

## Idea

- Scan the string group by group with two pointers.
- For each group, advance `j` until the character changes.
- If the group length is at least `3`, add `[start, end]` to the answer.

## Why It Works

- Consecutive equal characters form exactly one group.
- The loop starts each iteration at the first character of a group and stops just after its last character.
- Checking `j - i >= 3` matches the large-group definition.

## Edge Cases

- A large group at the end is counted because `j` can advance to `n`.
- Strings with no repeated run of length `3` return an empty list.
- Single-character groups are skipped.

## Complexity

- Time: `O(n)`, where `n` is `s.length()`.
- Space: `O(1)` excluding the returned intervals.
