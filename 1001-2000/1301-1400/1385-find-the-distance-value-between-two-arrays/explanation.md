# 1385. Find the Distance Value Between Two Arrays

## Idea

- Check every value in `arr1` against every value in `arr2`.
- Count it only when every absolute difference is greater than `d`.

## Why It Works

- The definition rejects an `arr1` value as soon as one `arr2` value is within distance `d`.
- If the inner loop finds no such value, that `arr1` value contributes exactly one to the answer.

## Edge Cases

- Equal values are rejected whenever `d` is non-negative because their distance is zero.
- Duplicate values are naturally handled because every element of `arr1` is checked independently.

## Complexity

- Time: $O(nm)$, where $n$ and $m$ are the two array lengths.
- Space: $O(1)$ beyond the returned answer.

## Tags

- Array
- Simulation
