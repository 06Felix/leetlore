# Max Sum of Rectangle No Larger Than K

## Idea

- Precompute row prefix sums so any row segment between two columns can be read in constant time.
- Fix a pair of columns and collapse the matrix between them into a 1D array of row sums.
- For that 1D array, find the maximum subarray sum no larger than `k` using prefix sums and a `TreeSet`.

## Why It Works

- Every rectangle is defined by left/right columns and a contiguous range of rows.
- Once columns are fixed, choosing the best row range is exactly the 1D max-subarray-no-larger-than-`k` problem.
- For current prefix `prefix`, a previous prefix at least `prefix - k` gives a valid subarray sum `<= k`; the smallest such prefix maximizes that sum.

## Edge Cases

- Negative values work because prefix sums and ordered lookup do not rely on monotonicity.
- A rectangle with exactly sum `k` is accepted and becomes optimal immediately if found.
- The initial prefix `0` allows subarrays starting at the first row.

## Complexity

- Time: `O(n^2 * m log m)`, where `m` is rows and `n` is columns.
- Space: `O(mn + m)` for row prefixes and the `TreeSet`.
