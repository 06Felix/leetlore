# Explanation

## Idea

Count places where the array decreases from `nums[i]` to `nums[i + 1]`. A sorted rotated array can have at most one such break.

If there is one break, the number of right shifts needed is the number of elements after that break.

## Why It Works

Right shifts can only sort the array if it is a rotation of a strictly increasing sorted array.

Such a rotation has exactly one drop, from the largest element to the smallest element. It also requires the last element to be less than the first; otherwise the wrap boundary is not valid.

When the break is at `pivot`, shifting right `n - 1 - pivot` times moves the smallest suffix to the front.

## Edge Cases

- Already sorted arrays have no break and return `0`.
- More than one break cannot be fixed by rotation.
- A single invalid wrap boundary returns `-1`.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
