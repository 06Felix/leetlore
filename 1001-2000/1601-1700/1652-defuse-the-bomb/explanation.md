# Explanation

## Idea
- Return a zero-filled result for `k = 0`.
- Otherwise initialize the sum of the next `k` values for positive `k`, or the last `-k` values for negative `k`, which are the previous values of index zero.
- Write each result, remove the window's first value, and add its next value using modulo indexing.

## Why It Works
- The initial window contains exactly the required neighbors for index zero in the chosen direction.
- Moving to the next output index shifts both neighborhood boundaries forward by one, so one removal and one addition update the sum correctly.
- Reading only the original array makes all replacements simultaneous as required.

## Edge Cases
- Negative keys wrap through the end of the array; positive keys wrap through the beginning.
- A key of magnitude `n - 1` sums every other element. For a one-element array, only zero is allowed.

## Complexity
- Time: $O(n + |k|) = O(n)$ under the key bound, including result initialization.
- Auxiliary space: $O(1)$ excluding the returned array.
