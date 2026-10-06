# Explanation

## Idea
- For each of 24 bit positions, count candidate values with that bit set.
- Return the largest count among those positions.

## Why It Works
- A positive bitwise AND requires at least one bit to be set in every selected value.
- For any fixed bit, choosing every candidate containing it yields a valid combination of that bit's frequency.
- Every valid combination is bounded by some shared-bit frequency, so the largest frequency is both achievable and optimal.

## Edge Cases
- Duplicate values count as separate selectable elements.
- One positive candidate yields one; checking 24 bits covers all values up to $10^7$.

## Complexity
- Time: $O(24n) = O(n)$.
- Auxiliary space: $O(1)$.
