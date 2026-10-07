# Explanation

## Idea
- Scan values while keeping `best`, the strongest prior spot's value reduced by its distance to the current position.
- Score the current spot as `best + val`, then update `best` to `max(val, best) - 1` for the next position.

## Why It Works
- Before position `j > 0`, `best` equals $\max_{i<j}(values[i]+i-j)$, so adding `values[j]` gives the best pair ending there.
- The update chooses between the strongest prior spot and the current one, then subtracts one for moving to the next index. Taking the largest ending score covers all valid pairs.

## Edge Cases
- A two-element array produces its only valid pair's score.
- The update charges another unit of distance at every step, even when the best starting spot does not change.

## Complexity
- Time: $O(n)$ for a single pass.
- Auxiliary space: $O(1)$.

## Notes
- The first iteration also considers `values[0]` without a second spot. This cannot change the answer under the stated positive-value constraint: the valid pair `(0, 1)` scores at least `values[0]`.
