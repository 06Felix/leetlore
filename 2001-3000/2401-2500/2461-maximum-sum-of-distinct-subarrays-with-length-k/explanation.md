# Explanation

## Idea
- Slide a length-`k` window, maintaining a `long` sum, value frequencies, and the number of values with positive frequency.
- Add the new value and remove the value falling out of the window; maximize the sum only for full windows with `k` distinct values.

## Why It Works
- Frequency transitions from zero to one and one to zero keep the distinct counter exact.
- A full length-`k` window has all different elements precisely when its distinct count is `k`.
- Every possible full window is examined once, so the largest eligible sum is returned.

## Edge Cases
- `k = 1` selects the largest element; repeated values can make every longer window invalid.
- Returning zero when no window qualifies is safe because permitted values are positive. `long` handles large window sums.

## Complexity
- Expected time: $O(n)$ with hash-map operations.
- Auxiliary space: $O(U)$ for all `U` distinct input values, potentially $O(n)$, since zero-frequency entries are retained rather than removed.
