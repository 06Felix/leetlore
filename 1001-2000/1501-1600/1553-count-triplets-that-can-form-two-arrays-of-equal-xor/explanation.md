# Explanation

Problem: [Count Triplets That Can Form Two Arrays of Equal XOR](https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/)

## Idea

For every start index `i`, extend an end index `j` while maintaining the XOR of `arr[i..j]`. Whenever this XOR is zero, every split point between `i` and `j` forms a valid triplet.

## Why It Works

The condition `a == b` is equivalent to `a ^ b == 0`, which means the XOR of the whole segment `arr[i..k]` is zero. If `arr[i..j]` has XOR zero, then for any split position between `i` and `j`, the left and right XORs are equal. There are `j - i` such split positions, so the implementation adds `j - i` to the answer. Checking all `(i, j)` segments counts every valid triplet.

## Edge Cases

- Segments of length one add zero splits, matching `i < split`.
- Repeated values and arbitrary integer values work because XOR is used directly.

## Complexity

- Time: `O(n^2)`.
- Space: `O(1)`.
