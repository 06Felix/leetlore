# Explanation

Problem: [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

## Idea

- Allocate a boolean array indexed by possible values.
- Scan `nums` from left to right.
- If a value has not been seen, mark it.
- If it has already been seen, return it as the duplicate.

## Why It Works

- Every value is in the range `1..n`, so it is a valid index in the `seen` array.
- The first time a value appears, marking it records that one occurrence has been found.
- When the same value appears again, the duplicate condition is proven, so returning it is correct.
- The problem guarantees exactly one repeated number, so the scan will encounter a repeated value.

## Edge Cases

- If the duplicate appears more than twice, the second occurrence is still returned.
- Dense duplicates such as `[3,3,3,3,3]` return as soon as the second `3` is seen.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- This accepted implementation does not modify `nums`, but it does use extra space, so it does not satisfy the follow-up requirement for constant extra space.
