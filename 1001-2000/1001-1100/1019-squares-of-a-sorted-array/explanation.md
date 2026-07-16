# Squares of a Sorted Array

## Idea

- The input is sorted, so the largest square must come from one of the two ends.
- The solution uses two pointers, `l` and `r`.
- It fills the answer array from right to left with the larger absolute-value square.
- The pointer that supplied the square moves inward.

## Why It Works

- Negative values with large magnitude are on the left, and large positive values are on the right.
- The maximum remaining square is always at one of those two boundaries.
- Filling from the back places squares in non-decreasing order.
- Repeating until the pointers cross processes every element exactly once.

## Edge Cases

- All-negative arrays work because the left pointer often supplies larger squares.
- All-nonnegative arrays work because the right pointer supplies values in descending square order.
- Zeros naturally settle near the beginning of the answer.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the returned array.
