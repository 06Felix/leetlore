# 2913. Subarrays Distinct Element Sum of Squares I

## Idea

- Fix the left end of a subarray, then keep extending its right end.
- A `HashSet` stores the values already present in the current subarray.
- After each extension, the set size is the distinct count. Add its square to the answer straight away.

## Why It Works

- For a fixed starting index, the inner loop visits every possible ending index exactly once.
- At that point, `seen` contains exactly the values in that subarray, because one new element was added for every extension.
- Repeating this for every starting index covers each non-empty subarray once, so every required squared distinct count is included once.

## Edge Cases

- Repeated values do not change the set size, but their larger subarrays are still counted.
- A one-element subarray always contributes `1`.
- The input limits for version I are small enough for checking all subarrays directly.

## Complexity

- Time: `O(n^2)`
- Space: `O(n)` for the set

## Tags

- Array
- Hash Table
- Enumeration
