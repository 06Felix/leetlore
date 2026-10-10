## Idea
- Put all values in a hash set and try pairs of starting values.
- Repeatedly extend a pair with its sum while that value exists, tracking the longest chain. Return zero if no chain reaches three.
- Restrict starting indices by the current best length and use powers of 1.618 for additional growth-based early breaks.

## Why It Works
- For fixed first two values, every subsequent Fibonacci-like value is forced. Positive, increasing values ensure each successful extension appears later in arr.
- Without pruning, testing every starting pair covers every valid chain; index bounds omit starts with too few remaining positions to improve the best.

## Edge Cases
- No valid triple returns zero.
- Equal or negative values are excluded by the statement. Pair sums are at most 2 × 10^9 and fit int.

## Complexity
- O(n² log M) expected time for pair searches and Fibonacci growth, where M is the largest value; pruning can reduce practical work.
- O(n) auxiliary space for the set.

## Notes
- The floating-point growth pruning uses the approximate constant 1.618 rather than an exact Fibonacci lower-bound calculation. Its safety depends on that bound and rounding; the basic pair-extension argument alone does not justify these early breaks.
