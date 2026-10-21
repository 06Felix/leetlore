# Minimum Number of Days to Make m Bouquets

## Idea
- Reject impossible requests when $m\cdot k$ exceeds the flower count, using `long` multiplication.
- Binary-search days from the earliest to the latest bloom. For each candidate, scan left to right, resetting progress at unbloomed flowers and forming a bouquet after every $k$ adjacent bloomed flowers.

## Why It Works
- A consecutive bloomed run of length $L$ yields exactly $\lfloor L/k\rfloor$ disjoint bouquets; the counter greedily achieves that maximum.
- Once a day permits $m$ bouquets, every later day also permits them. Binary search therefore finds the first feasible day.

## Edge Cases
- The initial size check handles impossible requests before searching; on all other inputs the latest bloom day is feasible.
- Resetting the remaining-flower counter after a bouquet prevents flower reuse. Equal bloom days and `k = 1` need no special treatment.

## Complexity
- $O(n\log D)$ time, where $D=\max(bloomDay)-\min(bloomDay)+1$.
- $O(1)$ auxiliary space; the input is unchanged.

## Notes
- The midpoint addition is safe under the stated maximum day of $10^9$; its operands sum to at most $2\cdot10^9$.
