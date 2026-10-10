## Idea
- Build a lazy segment tree storing maximum remaining demand over each interval.
- Apply each query as a range subtraction of its full capacity. Stop at the first prefix whose overall maximum is nonpositive; return -1 if none succeeds.

## Why It Works
- Each index can choose its decrement independently, so a query prefix is sufficient exactly when its cumulative capacity covers every initial value.
- Negative tracked demand represents excess capacity, not an actual requirement to make values negative. A nonpositive maximum means every index can be made exactly zero.
- Lazy propagation implements uniform range subtraction while preserving interval maxima, and checking prefixes in order returns the smallest k.

## Edge Cases
- An initially all-zero array returns zero before processing queries.
- Uncovered positive demand yields -1; excess capacity is harmless because decrements are optional.

## Complexity
- O(n + q log n) time for construction and q range updates, with O(1) root checks.
- O(n) auxiliary space for tree and lazy arrays; inputs are unchanged.
