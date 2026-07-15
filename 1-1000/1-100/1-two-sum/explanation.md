# Explanation

## Idea

- Enumerate pairs by their distance `j` in the array.
- For each distance, compare every valid pair `(i, i + j)` with the target sum.
- Return the first matching pair of indices.

## Why It Works

- Every pair of distinct indices can be written as `(i, i + j)` for some positive `j`.
- The outer loop tries every possible distance, and the inner loop tries every starting index valid for that distance.
- Therefore, the unique valid pair is eventually checked and returned.

## Edge Cases

- Duplicate values such as `[3, 3]` are handled because the two indices are distinct.
- Negative values work because the implementation compares the integer sum directly.
- The fallback result is unreachable under the problem guarantee that exactly one solution exists.

## Complexity

- Time: `O(n^2)` in the worst case.
- Space: `O(1)` auxiliary space.

## Notes

- This is the actual submitted implementation and satisfies the basic problem, but it does not meet the follow-up asking for less than `O(n^2)` time. A hash map from value to index can solve the follow-up in `O(n)` expected time and `O(n)` space.
