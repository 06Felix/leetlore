## Idea
- Binary-search speeds from one to the largest pile.
- For each candidate, sum ceil(pile / speed) using integer division. Raise the lower bound if the total exceeds h; otherwise lower the upper bound to the candidate.

## Why It Works
- Required hours are nonincreasing as speed increases, giving a monotone feasibility test.
- The maximum pile speed is feasible because h is at least the pile count. The search retains the smallest feasible speed until its bounds meet.

## Edge Cases
- When h equals the number of piles, the answer is the largest pile.
- Large total hours use long. The midpoint sum fits int because both bounds are at most 10^9.

## Complexity
- O(n log M) time, where M is the maximum pile size.
- O(1) auxiliary space; piles is unchanged.
