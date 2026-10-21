# Reduction Operations to Make the Array Elements Equal

## Idea

- Sort nums and scan distinct-value boundaries from right to left. At each drop nums[i] != nums[i - 1], add the number of elements in the suffix n - i.

## Why It Works

- Every element at or above a boundary must cross that distinct-value level once before reaching the minimum. The suffix size counts precisely those necessary reductions; summing boundaries counts every operation exactly once.

## Edge Cases

- An already constant array has no boundaries and returns zero. Duplicate values cross each lower distinct level independently.

## Complexity

- O(n log n) time and O(log n) sorting stack space.

## Notes

- Sorting mutates nums. The answer is at most n(n - 1)/2, which fits int for n <= 50000. The tie-breaking choice among equal maximum values does not alter the operation count.
