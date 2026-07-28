# Explanation

## Idea

Track cumulative path length by depth. `m.get(depth)` stores the length of the absolute path prefix before the current name at that depth.

Each line's depth is its number of leading tab characters.

## Why It Works

For a directory, the prefix length for its children is parent prefix plus directory name length plus one slash.

For a file, the full path length is parent prefix plus file name length. The answer keeps the maximum such file length.

Since the input lists parents before children, the needed parent depth length is already known.

## Edge Cases

- If no file name contains `.`, answer remains `0`.
- Spaces in names remain part of the name length.
- Root depth starts from prefix length `0`.

## Complexity

Time: `O(L)`, where `L` is the input length.

Space: `O(D)`, where `D` is the maximum depth.
