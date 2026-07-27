# Explanation

## Idea

The implementation checks whether `s` and `target` either both contain at least one `1`, or both contain no `1`.

That condition is the only reachable-state distinction needed.

## Why It Works

If a string has no `1`, every operation on two zeroes keeps both positions zero, so it can only reach another all-zero string.

If a string has at least one `1`, operations can move and create the needed pattern while preserving the ability to keep at least one `1`. Thus any nonzero binary string can be transformed into any other nonzero binary string of the same length.

So equality of `contains("1")` exactly determines reachability.

## Edge Cases

- All-zero to all-zero returns `true`.
- All-zero to nonzero returns `false`.
- Nonzero to all-zero returns `false`.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
