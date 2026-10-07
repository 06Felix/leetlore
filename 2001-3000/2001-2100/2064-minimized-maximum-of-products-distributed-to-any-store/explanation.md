# Explanation

## Idea
- Binary-search the maximum permitted load from one through the largest product quantity.
- For a proposed load `cap`, sum $\lceil quantity/cap \rceil$ over types using `(quantity - 1) / cap + 1`.
- A load is feasible if this sum does not exceed the available stores; stop counting early once it does.

## Why It Works
- Each type requires exactly its ceiling number of stores when no store may mix types.
- Increasing the load cap cannot increase the required store count, so feasibility is monotonic.
- Lower-bound binary search returns the smallest feasible cap, which minimizes the largest store load.

## Edge Cases
- With one store per type, the answer is the largest quantity.
- Extra stores can remain empty; cap one is valid when enough stores exist. Early rejection keeps the count close to the store limit and avoids large accumulated totals.

## Complexity
- Time: $O(m \log Q)$ for `m` product types and largest quantity `Q`, plus an $O(m)$ initial maximum scan.
- Auxiliary space: $O(1)$.
