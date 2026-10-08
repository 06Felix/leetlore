# Explanation

## Idea
- Process each column top to bottom, tracking the minimum permissible next value as the preceding adjusted value plus one.
- Raise an entry only if it is below that bound and add the required increments to the answer.

## Why It Works
- Strict increase forces the current entry to exceed its adjusted predecessor.
- Choosing the smallest allowed value minimizes its own cost and every later lower bound. Columns have no cross-column restrictions, so their minimum costs add independently.

## Edge Cases
- A single-row grid needs no changes.
- An already increasing column stays unchanged; repeated values are raised only as necessary.

## Complexity
- Time: $O(mn)$ for all cells.
- Auxiliary space: $O(1)$.

## Notes
- Adjustments are written into the input grid in place.
