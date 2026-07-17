# Explanation

## Idea

- Use an integer array as a stack of valid scores.
- `size` points to the next free stack position.
- Apply each operation by pushing, popping, doubling, or summing the previous two scores.

## Why It Works

- The problem operations only depend on the current record suffix.
- The array stack preserves all valid scores in order.
- Removing a score is just decrementing `size`, so later summation ignores invalidated entries.

## Edge Cases

- Negative numeric scores parse normally.
- `"C"` after one score leaves an empty record.
- The final sum only iterates over `0..size-1`, excluding canceled scores.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- The solution imports `java.util.Stack`, but it actually uses an integer array stack.
