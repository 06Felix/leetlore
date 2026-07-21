# Magnetic Force Between Two Balls

## Idea

- Sort basket positions.
- Binary search the minimum allowed distance between any two placed balls.
- For a candidate `force`, greedily place balls from left to right whenever the next position is at least `force` away from the previous placement.
- If at least `m` balls fit, try a larger force.

## Why It Works

- Feasibility is monotonic: if distance `d` works, every smaller distance also works.
- For a fixed distance, greedy leftmost placement leaves maximum room for remaining balls.
- `numBalls` counts how many balls can be placed with that minimum distance.
- Binary search finds the largest feasible distance.

## Edge Cases

- `m = 2` can use the two farthest positions.
- Adjacent close positions are skipped when they violate the candidate force.
- The upper bound is the distance between sorted endpoints.

## Complexity

- Time: $O(n \log n + n \log R)$ where `R` is the position range.
- Space: $O(1)$ extra besides sorting implementation details.
