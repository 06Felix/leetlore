# Explanation

## Idea

Use a min-heap. Each operation flips the current smallest value and pushes it back.

After exactly `k` flips, sum everything left in the heap.

## Why It Works

Flipping the smallest value gives the largest immediate increase in total sum. Negative values become positive first; if all values are nonnegative, the smallest value is the least harmful one to flip.

Because the changed value is inserted back into the heap, the next operation again uses the current best candidate.

## Edge Cases

- A zero can absorb extra flips without changing the sum.
- If `k` remains odd after all negatives are handled, the smallest absolute value is flipped.
- The same index can be flipped multiple times, modeled by polling and reoffering.

## Complexity

Time: `O((n + k) log n)`.

Space: `O(n)`.
