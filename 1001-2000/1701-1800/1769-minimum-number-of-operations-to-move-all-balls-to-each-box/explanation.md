# Explanation

## Idea
- Scan left to right, adding the cost of bringing earlier balls to each box; track both their count and accumulated movement cost.
- Repeat from right to left to add the cost of later balls.

## Why It Works
- Moving the target one position farther from all balls already scanned increases their total cost by exactly their count.
- Each scan adds its cost before including the current box's ball, whose distance to itself is zero. Combining the two directions sums every ball's distance to that target.

## Edge Cases
- An empty set of balls produces all-zero answers.
- A one-box input has cost zero whether it contains a ball or not.

## Complexity
- Time: $O(n)$ for two passes.
- Space: $O(n)$ for the returned array and $O(1)$ additional counters.
