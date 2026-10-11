# Push Dominoes

## Idea
- Track the latest leftward and rightward pushes while scanning a mutable character array.
- Fill gaps after an unmatched `R` with rightward falls; fill gaps before an unmatched `L` with leftward falls.
- Between `R` and `L`, fill inward from both ends, leaving a center domino upright if the forces meet there.

## Why It Works
- Equal-direction pushes propagate that direction through the gap; `L...R` pushes away from the gap and leaves it unchanged.
- In `R...L`, each force advances one position per second, so the nearer force wins and an equidistant center stays upright.
- An end-of-string sentinel flushes any remaining rightward run without writing beyond the array.

## Edge Cases
- Leading dots fall left only when an `L` reaches them; trailing dots fall right only after an unmatched `R`.
- An all-dot string stays unchanged, and adjacent opposing pushes have no interior gap to fill.

## Complexity
- Time: $O(n)$; gap filling touches each position only a constant number of times.
- Space: $O(n)$ for the character array and returned string.
