# Explanation

## Idea

Use a min-heap. Each operation increments the current smallest number, then puts it back.

After all `k` operations, multiply all values from the heap modulo `1_000_000_007`.

## Why It Works

For a fixed product of nonnegative values, increasing the smallest value gives the best immediate product gain and helps keep the numbers balanced.

Repeating that choice greedily maximizes the final product before the modulo is applied.

## Edge Cases

- Zero values are incremented first because they are smallest.
- `k` can be large, but each increment is one heap pop and push.
- The product is accumulated in `long` before reducing modulo.

## Complexity

Time: `O((n + k) log n)`.

Space: `O(n)`.
