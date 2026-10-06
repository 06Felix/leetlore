# Explanation

## Idea
- Build the all-ones mask `(1 << maximumBit) - 1`.
- Accumulate prefix XORs while reading the input from its beginning, but write each answer from the output's end toward its beginning.
- For each prefix XOR, use its XOR with the mask as the optimal `k`.

## Why It Works
- Complementing every permitted bit of a prefix XOR makes the resulting XOR equal to the mask, the maximum possible value in the bit range.
- All input values fit that range, so the complement is a legal nonnegative `k` below $2^{maximumBit}$.
- The queries remove elements from the end, so their prefixes shrink in reverse order; reversed answer placement matches that order.

## Edge Cases
- A zero prefix XOR chooses the full mask; a prefix XOR equal to the mask chooses zero.
- The method does not need sorted values for its computation and leaves the input unchanged.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(1)$ excluding the returned $O(n)$ answer array.
