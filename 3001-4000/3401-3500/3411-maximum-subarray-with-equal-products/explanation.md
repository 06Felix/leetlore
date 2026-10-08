# Explanation

## Idea
- Enumerate all subarray starts and extend each endpoint while maintaining its product, GCD, and LCM.
- Update the longest length whenever the maintained product equals `LCM * GCD`.

## Why It Works
- Multiplication, `gcd(previousGcd, next)`, and `lcm(previousLcm, next)` give the aggregates of the extended subarray.
- Every subarray is enumerated once, so exact arithmetic would test the defining condition for every candidate and select the longest match.

## Edge Cases
- A singleton satisfies the equality only when its value is one.
- Every two-element positive array satisfies `product == LCM * GCD`; initial GCD zero and LCM one correctly seed the aggregates.

## Complexity
- Time: $O(n^2\log B)$ as an upper bound for GCD work with bounded aggregate `B`; here all LCMs divide 2520.
- Auxiliary space: $O(\log B)$ for recursive GCD calls; subarray aggregates use constant storage.

## Notes
- `cur` is an `int`, although the mathematical product can exceed its range: ten values of ten have product $10^{10}$. Overflow makes the product comparisons use wrapped values rather than the defined product, so arithmetic correctness is not guaranteed. This is an overflow risk, not a demonstrated failing final answer; the imported solution is unchanged.
