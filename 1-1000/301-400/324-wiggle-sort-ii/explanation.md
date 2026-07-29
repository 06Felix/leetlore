# Wiggle Sort II

## Idea

- Find the median with `nth_element`.
- Use virtual indexing `A(i) = nums[(1 + 2 * i) % (n | 1)]` so larger values land on odd positions first.
- Three-way partition around the median through that virtual index order.

## Why It Works

- Wiggle order needs larger elements at odd indices and smaller elements at even indices.
- Virtual indexing visits odd positions before even positions, spreading equal median values apart.
- Dutch-national-flag partitioning places values greater than the median first, values less than the median last, and medians in the remaining positions.

## Edge Cases

- Duplicate median values are handled by the three-way partition.
- Odd and even lengths both work because `(n | 1)` gives an odd modulus for the virtual mapping.
- The problem guarantees a valid wiggle arrangement exists.

## Complexity

- Time: average `O(n)` from `nth_element` plus linear partitioning.
- Space: `O(1)` extra.
