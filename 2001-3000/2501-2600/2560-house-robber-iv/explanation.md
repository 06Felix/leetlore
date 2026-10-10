## Idea
- Binary-search a capability between the smallest and largest house amounts.
- For each candidate, greedily take the first eligible house and skip its neighbor, counting how many nonadjacent houses can be selected.

## Why It Works
- Choosing the earliest eligible house leaves at least as much remaining room as any later first choice, so the greedy scan maximizes the count at that threshold.
- Larger thresholds cannot reduce eligibility. Searching this monotone test yields the smallest capability allowing at least k selections.

## Edge Cases
- k = 1 returns the smallest house amount.
- Equal amounts and a singleton are handled normally; the statement guarantees some feasible nonadjacent selection.

## Complexity
- O(n log(R + 1)) time for value range R = max(nums) - min(nums).
- O(1) auxiliary space; midpoint arithmetic fits int under the 10^9 bound.
