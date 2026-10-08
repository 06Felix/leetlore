# Explanation

## Idea
- Search divisors downward from the integer square root of `num + 2`.
- At each candidate, test `num + 1` first and `num + 2` second, returning the first factor pair found.

## Why It Works
- For a fixed product, the largest divisor not exceeding its square root gives the smallest factor gap.
- Across these two consecutive products, a larger smaller-factor wins over any smaller candidate; at the same divisor, `num + 1` gives the smaller gap. The descending order and first-product priority therefore select a global minimum.

## Edge Cases
- A perfect square can yield equal factors and gap zero.
- Divisor one always succeeds, so the final null return is unreachable for valid input.

## Complexity
- Time: $O(\sqrt{num})$ in the worst case.
- Auxiliary space: $O(1)$.
