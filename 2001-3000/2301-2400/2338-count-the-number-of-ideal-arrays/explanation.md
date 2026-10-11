# Count the Number of Ideal Arrays

## Idea
- Enumerate each possible final value and factor it by trial division.
- For every prime exponent $e$ in that value, multiply by $\binom{n+e-1}{e}$ using precomputed factorials and inverse factorials modulo $10^9+7$.

## Why It Works
- Divisibility means each prime's exponent can only increase along the array.
- Distributing the final exponent among the initial exponent and the next $n-1$ nonnegative increases gives the stars-and-bars count $\binom{n+e-1}{e}$.
- Different primes vary independently. Every preceding value divides the final value and therefore stays within `maxValue`; summing over final values counts each array once.

## Edge Cases
- Final value one has no prime factors and contributes the all-ones array.
- Repeated prime factors contribute their full exponent, rather than merely one factor. The factorial tables of length `n + maxValue` cover all required combination indices.

## Complexity
- Time: $O(n+V+V\sqrt V)$ as a worst-case bound for $V=maxValue$, including separate trial division for every value.
- Space: $O(n+V)$ for modular tables, plus a small per-value factor map.
