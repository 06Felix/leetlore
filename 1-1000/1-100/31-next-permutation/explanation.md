# Explanation

Problem: [Next Permutation](https://leetcode.com/problems/next-permutation/)

## Idea

- Scan from right to left to find the first index `i` where `nums[i] < nums[i + 1]`.
- If such an index exists, scan from the right again to find the smallest suffix value greater than `nums[i]`, then swap them.
- Reverse the suffix after `i`.
- If no pivot exists, reversing the whole array produces the lowest permutation.

## Why It Works

- The suffix after the pivot is non-increasing, so it is already the largest possible order for that suffix.
- To get the next larger permutation, the pivot must be increased by the smallest possible amount.
- Scanning from the right finds the rightmost value greater than the pivot, which is the smallest usable increase within the non-increasing suffix.
- Reversing the suffix makes it ascending, giving the smallest arrangement after the increased prefix.

## Edge Cases

- Fully descending arrays have no pivot and become ascending.
- Arrays with duplicate values still work because the pivot requires a strict increase.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The implementation mutates `nums` in place through helper `swap` and `reverse`.
