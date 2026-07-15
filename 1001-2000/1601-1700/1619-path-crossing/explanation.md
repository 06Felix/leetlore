# Explanation

Problem: [Path Crossing](https://leetcode.com/problems/path-crossing/)

## Idea

- Track the current coordinate `(x, y)` while walking the path.
- Store each visited coordinate as a string such as `"0,0"`.
- After every move, return `true` if the new coordinate is already in the visited list.

## Why It Works

- The list starts with the origin, so returning to `(0, 0)` is detected.
- Each move updates exactly one coordinate according to the direction.
- A path crosses itself exactly when the current coordinate has been visited before, which is the condition checked after every step.

## Edge Cases

- Immediate backtracking, such as `"NS"`, is detected on the second position.
- Paths with no repeated coordinate finish the loop and return `false`.

## Complexity

- Time: $O(n^2)$ for path length `n`, because each `contains` call scans the visited list.
- Space: $O(n)$ for stored coordinates.

## Notes

- A `HashSet` would make the membership checks expected $O(1)$, but the existing implementation uses `ArrayList`.
