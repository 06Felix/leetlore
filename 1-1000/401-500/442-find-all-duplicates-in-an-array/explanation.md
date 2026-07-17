# Explanation

## Idea

- Allocate a count array indexed by value.
- Scan `nums` once.
- When a value is seen for the second time, add it to the answer.

## Why It Works

- Values are in the range `[1, n]`, so each value can be counted directly by index.
- Each value appears at most twice.
- The check `ct[x]++ == 1` is true exactly on the second occurrence.

## Edge Cases

- Values that appear once are never added.
- A single-element input returns an empty list.
- Multiple duplicated values are added independently.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the count array, excluding the output.

## Notes

- The problem asks for constant auxiliary space. This implementation uses an extra count array, so it does not meet that stricter space requirement even though it returns correct duplicate values.
