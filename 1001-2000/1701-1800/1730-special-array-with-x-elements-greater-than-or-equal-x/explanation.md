# Explanation

Problem: [Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)

## Idea

Bucket values by their capped size from `0` to `n`. Values at least `n` go into bucket `n`. Then scan candidate `x` values downward while accumulating how many numbers are at least the current candidate.

## Why It Works

Only `x` values from `1` to `n` can be valid, because there are `n` numbers total. Capping every value above `n` into bucket `n` preserves whether it is greater than or equal to any candidate `x <= n`. During the descending scan, `res` is the count of numbers greater than or equal to `i`. If `res == i`, exactly `i` numbers are at least `i`, so `i` is the special value and is returned. If no candidate matches, the array is not special.

## Edge Cases

- Arrays of all zeros return `-1`.
- Values larger than `n` are handled by the capped bucket.

## Complexity

- Time: `O(n)`.
- Space: `O(n)`.
