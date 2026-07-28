# Explanation

## Idea

Sort the array, then swap every adjacent pair `(0, 1)`, `(2, 3)`, and so on.

This creates a low-high-low-high style arrangement where each interior element is not exactly between its neighbors.

## Why It Works

After sorting, every swapped pair puts a larger value before a smaller value. This breaks the monotonic triples that could make one element equal the average of its neighbors.

Because all values are distinct, the local alternating pattern prevents any interior value from sitting exactly halfway between both adjacent values.

## Edge Cases

- Odd-length arrays leave the final largest element in place.
- Distinct input values avoid equality ambiguity.
- Sorting mutates and returns the input array.

## Complexity

Time: `O(n log n)`.

Space: `O(1)` extra aside from sorting internals.
