# Explanation

Problem: [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)

## Idea

- Reuse the `cost` array as dynamic programming storage.
- For each step `i >= 2`, add the cheaper cost of reaching `i - 1` or `i - 2`.
- After processing all steps, the top can be reached from either of the last two steps.
- Return the smaller of those two final costs.

## Why It Works

- To land on step `i`, the previous paid step must be either `i - 1` or `i - 2`.
- The cheapest total cost to reach `i` is therefore `cost[i] + min(best[i-1], best[i-2])`.
- Updating the array in increasing order ensures those previous best values are already computed.
- The top is beyond the last index, so no extra cost is paid after choosing the cheaper last or second-last step.

## Edge Cases

- Arrays of length `2` skip the loop and return the cheaper starting step.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ extra.

## Notes

- The implementation mutates the input `cost` array.
