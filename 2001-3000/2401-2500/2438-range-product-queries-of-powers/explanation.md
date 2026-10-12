## Idea

- Decompose n into its set-bit powers, precompute products for every query range, and answer by indexing the table.

## Why It Works

- The selected powers are exactly n’s binary components; each table entry multiplies the requested contiguous component range modulo MOD.

## Edge Cases

- A single component range returns that power directly.

## Complexity

- O(B²+q) time and O(B²) space for B set bits.
