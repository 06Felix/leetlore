# Minimum Number of Operations to Make Elements in Array Distinct

## Idea
- Scan from right to left, counting values in a fixed array of size 101.
- At the first repeated value at index `i`, return `(i + 3) / 3`; return zero if no repetition appears.

## Why It Works
- Before that repeat, the suffix starting at `i + 1` is distinct. Any suffix starting at or before `i` includes both equal occurrences and cannot be distinct.
- Removing prefixes in groups of three requires $\lceil(i+1)/3\rceil$ operations to pass index `i`, exactly `(i + 3) / 3` with integer division.

## Edge Cases
- An already distinct array requires zero operations; removals may leave an empty array, which is valid.
- The value-count array relies on the stated range 1 through 100, and the input array is not modified.

## Complexity
- Time: $O(n)$ worst case, with early return at the first backward duplicate.
- Space: $O(101)=O(1)$ under the bounded value range.
