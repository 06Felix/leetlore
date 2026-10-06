# Explanation

## Idea
- Precompute pairwise and triple least common multiples with Euclid's GCD algorithm.
- Count numbers at most a candidate value divisible by any of `a`, `b`, or `c` using inclusion-exclusion.
- Binary-search the smallest value whose count is at least `n`, within the guaranteed answer range.

## Why It Works
- Single-divisor counts include overlaps; subtracting pairwise LCM counts and restoring the triple overlap counts each eligible number once.
- The count is nondecreasing as the candidate increases, enabling lower-bound binary search.
- The first value reaching count `n` is precisely the nth eligible number.

## Edge Cases
- Equal divisors and divisors that divide one another are handled by inclusion-exclusion without special cases.
- A divisor of one makes every positive integer eligible; the guaranteed upper bound keeps the answer inside the search interval.

## Complexity
- Time: $O(\log M + \log A)$ for search bound $M = 2 \cdot 10^9$ and maximum GCD operand `A`; each search step uses a fixed number of divisions.
- Auxiliary space: $O(\log A)$ for recursive GCD calls.

## Notes
- LCMs and counts use `long`. The stated product bound $abc \le 10^{18}$ keeps the multiplication intermediates within range.
