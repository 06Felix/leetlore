# Relative Sort Array

## Idea

- Count every value in `arr1` with a fixed frequency array `ct` of size `1001`.
- Write all values from `arr2` first, repeating each value by its frequency.
- Then scan `ct` from `0` to `1000` and write leftover values in ascending order.
- Return the filled `ans` array.

## Why It Works

- Values in `arr2` define the required relative order, so consuming their counts first places them correctly.
- Decrementing `ct[n]` writes every duplicate occurrence exactly once.
- Any value not in `arr2` remains in `ct` after the first pass.
- The final increasing scan puts those remaining values in ascending order.

## Edge Cases

- Duplicate values in `arr1` are preserved through counts.
- Values absent from `arr2` move to the end.
- Constraint `arr1[i] <= 1000` makes the fixed count array valid.

## Complexity

- Time: $O(n + U)$ where `U = 1001`.
- Space: $O(U + n)$ for counts and output.
