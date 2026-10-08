# Explanation

## Idea
- At each of 32 bit positions, count values with that bit set.
- Add `setCount * (n - setCount)` to the answer.

## Why It Works
- At a given position, a pair differs exactly when one value has a set bit and the other does not.
- Choosing one value from each group counts every differing unordered pair once. Summing independent bit contributions gives total Hamming distance.

## Edge Cases
- Repeated values contribute no distance to one another.
- A singleton returns zero; zero values belong to the unset group at every position.

## Complexity
- Time: $O(32n)$, linear for fixed-width integers.
- Auxiliary space: $O(1)$.

## Notes
- The sign-bit test uses `> 0`, which would miss negative integers' sign bits. This is harmless under the stated nonnegative input bounds; the final answer is guaranteed to fit `int`.
