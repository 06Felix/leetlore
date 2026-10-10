# Minimum Operations to Make Array Values Equal to K

## Idea
- Return `-1` immediately if any value is below `k`.
- Otherwise collect distinct values above `k` in a set and return the set's size.

## Why It Works
- Operations only decrease values, so a value below `k` can never reach the target.
- A valid threshold can reduce only the current highest distinct level; each distinct level above `k` must be eliminated at least once.
- Reducing the highest level to the next lower level repeatedly, ending at `k`, achieves this bound in one operation per distinct level above `k`.

## Edge Cases
- Values already equal to `k` require no work, and repeated higher values are reduced together.
- If every value exceeds `k`, the final operation reduces the last remaining level to `k` even when `k` was absent initially.

## Complexity
- Expected time: $O(n)$ with hash-set operations.
- Space: $O(d)$ for $d$ distinct values above `k`, at most 100 under the constraints.
