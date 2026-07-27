# Explanation

Problem: [Make Two Arrays Equal by Reversing Subarrays](https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/)

## Idea

- Count the frequency of every value in `target`.
- Count the frequency of every value in `arr`.
- Return whether the two frequency maps are equal.

## Why It Works

- Reversing subarrays can reorder elements but cannot change which values appear or how many times they appear.
- If the two arrays have different value counts, no sequence of reversals can make them equal.
- If the counts match, the elements of `arr` can be rearranged into the order of `target`; subarray reversals are enough to realize arbitrary reorderings.
- Therefore equality of `Counter` objects is exactly the condition needed.

## Edge Cases

- Arrays of length `1` compare equal only when their single values match.
- Duplicate values are handled by frequency counts, not just set membership.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- The implementation uses `collections.Counter` and does not modify either input array.
