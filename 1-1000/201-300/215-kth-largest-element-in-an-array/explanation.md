# Kth Largest Element in an Array

## Idea

- Insert values into a min-heap and remove its minimum whenever the heap exceeds size k. Return the final minimum.

## Why It Works

- After every insertion, the heap contains the k largest values of the processed prefix, or all values when fewer than k have been seen. Discarding the smallest of k + 1 candidates preserves that invariant; the final minimum is the kth largest.

## Edge Cases

- Duplicates count as separate elements. k = 1 returns the maximum, while k = n returns the minimum.

## Complexity

- O(n log(k + 1)) time and O(k) auxiliary space.

## Notes

- The method does not sort or modify nums, meeting the requested non-sorting approach.
