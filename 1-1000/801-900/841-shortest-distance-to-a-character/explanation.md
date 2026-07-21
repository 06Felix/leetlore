# Shortest Distance to a Character

## Idea

- Make two passes over the string.
- Left to right, remember the latest seen index `p` of character `c`.
- Store distance to the nearest `c` on the left in `ans[i]`.
- Right to left, update `p` again and minimize with distance to the nearest `c` on the right.

## Why It Works

- The closest occurrence of `c` to any index is either on its left or on its right.
- The first pass computes the best left-side distance for every index.
- The second pass computes the best right-side distance and takes the smaller value.
- Initializing `p = -n` makes distances before the first left-side `c` safely large.

## Edge Cases

- If `s[i] == c`, both passes can set distance `0`.
- If all characters are `c`, all distances stay `0`.
- The guarantee that `c` appears means the right-to-left pass has a valid final `p`.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the returned array.
