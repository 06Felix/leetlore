# Explanation

## Idea
- Compute the largest demand and the total number of cups.
- Return $\max(\text{largest}, \lceil \text{total}/2 \rceil)$, using `(sum + 1) / 2` for the ceiling.

## Why It Works
- At most one cup of a given type can be filled per second, giving the largest-demand lower bound.
- At most two cups can be filled per second, giving the half-total lower bound.
- If one type dominates, pair its cups with other types and finish its remaining cups singly. Otherwise, pairing different types reaches the half-total bound, with one single cup if the total is odd.

## Edge Cases
- Three zero demands return zero.
- A single nonzero type takes exactly its demand; odd totals are rounded up correctly.

## Complexity
- Time: $O(1)$ because there are exactly three entries.
- Auxiliary space: $O(1)$.
