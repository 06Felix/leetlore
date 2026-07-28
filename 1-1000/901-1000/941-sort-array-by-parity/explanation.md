# Explanation

## Idea

Use two pointers. The left pointer searches for misplaced odd numbers; the right pointer searches for misplaced even numbers.

When both are found, swap them.

## Why It Works

All even numbers must end up before all odd numbers. If `nums[l]` is odd and `nums[r]` is even, swapping fixes both sides.

After each step, the left pointer advances past even values and the right pointer retreats past odd values, so the unchecked region keeps shrinking.

## Edge Cases

- Already partitioned arrays just move the pointers.
- A single element returns unchanged.
- Zero is even and correctly moves to the front side.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
