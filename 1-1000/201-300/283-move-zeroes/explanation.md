# Explanation

Problem: [Move Zeroes](https://leetcode.com/problems/move-zeroes/)

## Idea

- Keep write index `j` for the next non-zero position.
- Scan the array from left to right.
- Copy each non-zero value to `nums[j]` and increment `j`.
- After all non-zero values are copied, fill the remaining suffix with zeroes.

## Why It Works

- Non-zero values are written in the same order they are encountered, so their relative order is preserved.
- After the scan, positions before `j` contain exactly all original non-zero values.
- The remaining positions must be zero in the desired output, and the final loop writes those zeroes.
- All writes are made into the original array, so the operation is in-place.

## Edge Cases

- Arrays with no zeroes are copied onto themselves and the suffix loop does nothing.
- Arrays with all zeroes skip the first writes and are filled with zeroes again.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- This implementation may overwrite a non-zero with itself, which keeps the code simple.
