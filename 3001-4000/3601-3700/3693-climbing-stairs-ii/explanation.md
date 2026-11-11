# 3693. Climbing Stairs II

## Idea

- Let `dp[i]` be the cheapest total cost for reaching step `i`.
- The final jump into step `i` can only come from steps `i - 1`, `i - 2`, or `i - 3`.
- Every way of landing on step `i` also pays `costs[i - 1]`.

## Why It Works

- Any valid route to step `i` has one of the three allowed final jump lengths.
- Before that jump, the route must already have reached its starting step as cheaply as possible; otherwise replacing its prefix with the best prefix would improve the route.
- Taking the cheapest of those three choices therefore gives the optimal cost for `i`.

## Edge Cases

- At steps 1 and 2, only jumps that start at step 0 or later are considered.
- The cost belongs to the step being reached, so step `i` uses `costs[i - 1]`.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Tags

- Array
- Dynamic Programming
