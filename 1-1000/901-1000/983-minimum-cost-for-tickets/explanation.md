# Explanation

## Idea
- Keep the minimum cost through the previous travel day and queues of candidate seven-day and thirty-day passes.
- Remove expired candidates, enqueue a pass starting today with cost `previousBest + passCost`, then choose between the one-day option and the two queue fronts.

## Why It Works
- A candidate combines optimal coverage before its starting travel day with a pass covering the current day while it remains unexpired.
- Optimal costs for increasing travel prefixes cannot decrease, so candidates enter each queue in nondecreasing total-cost order. Its earliest unexpired entry is therefore its cheapest active option.
- Taking the cheapest option covering each next travel day gives the optimal prefix cost.

## Edge Cases
- A pass starting on day `d` expires at `d + duration`, matching the `<= day` removal test.
- Gaps in travel remove obsolete candidates without requiring a scan through non-travel days.

## Complexity
- Time: $O(D)$ for `D` travel days; each candidate is inserted and removed at most once.
- Auxiliary space: $O(7 + 30)$, constant for the fixed durations, because travel days are distinct integers.
