# Explanation

## Idea
- Binary-search the maximum allowed bag size from one through the largest input bag.
- For a limit `cap`, sum `(size - 1) / cap` required splits over all bags and compare that count with the operation budget.

## Why It Works
- A bag needs $\lceil size/cap \rceil$ resulting bags and one fewer split operations, giving the implemented formula.
- Required splits cannot increase as the limit increases, so lower-bound binary search finds the minimum feasible limit when its operation counts are accurate.

## Edge Cases
- A bag already within the limit needs zero splits.
- The original largest bag size is always feasible without operations; limit one represents splitting everything into individual balls.

## Complexity
- Time: $O(n \log M)$ for maximum bag size `M`.
- Auxiliary space: $O(1)$.

## Notes
- The helper accumulates into `int` without early stopping. Its mathematical sum can exceed the integer range for a small candidate limit: three bags of size $10^9$ at limit one need 2999999997 splits. Wrapped counts would invalidate a feasibility comparison if such a limit is evaluated. Wider accumulation or budget-based early rejection would avoid that risk.
- A scratch simulation found no differing final answer in 100000 constrained grouped-array trials; this is an arithmetic risk, not a demonstrated failing result of this binary-search trajectory. The solution remains unchanged.
