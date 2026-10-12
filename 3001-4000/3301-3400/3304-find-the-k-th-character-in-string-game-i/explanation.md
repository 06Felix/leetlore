## Idea

- Return a plus the population count of k−1.

## Why It Works

- In zero-based indexing, each set bit chooses the appended half at one doubling level. Each such choice increments the character once, so the total shift is the number of set bits.

## Edge Cases

- k = 1 returns a. Under k ≤ 500 the shift is below 26, so wrapping is unnecessary.

## Complexity

- O(1) time and space for the fixed-width integer.
