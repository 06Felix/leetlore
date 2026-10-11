# Distribute Candies Among Children II

## Idea
- Count unrestricted distributions among three children using $ways(x)=\binom{x+2}{2}$ for nonnegative `x`, otherwise zero.
- Apply inclusion-exclusion by subtracting cases where one child gets at least `limit + 1`, adding cases with two violators, and subtracting three-violator cases.

## Why It Works
- Subtracting `limit + 1` from each violating child reduces that event to an unrestricted nonnegative distribution of the remaining candies.
- There are three single-child and three two-child choices; alternating signs remove exactly all over-limit distributions.

## Edge Cases
- Negative residual totals contribute zero automatically.
- If `n > 3 * limit`, no valid distribution remains; each child may receive zero. The combination and result use `long`.

## Complexity
- Time: $O(1)$ for four fixed-size combination calculations.
- Space: $O(1)$ auxiliary storage.
