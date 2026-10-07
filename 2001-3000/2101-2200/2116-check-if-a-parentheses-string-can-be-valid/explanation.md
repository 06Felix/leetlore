# Explanation

## Idea
- Reject odd string lengths.
- Scan left to right, tracking locked opening-minus-closing balance and the number of flexible positions; reject any prefix where even treating all flexible positions as openings cannot avoid a negative balance.
- Scan right to left with closing-minus-opening balance, similarly rejecting a suffix that lacks enough possible closings.

## Why It Works
- Every valid prefix needs at least as many openings as closings, making the forward feasibility test necessary. The reverse test gives the corresponding closing requirement for every suffix.
- For an even-length string, these conditions are also sufficient: enough flexible positions exist to choose the required total openings, and assigning those openings to the earliest flexible positions preserves the prefix constraints while later ones supply closings.

## Edge Cases
- An entirely unlocked even-length string can always be balanced.
- A locked leading closing or trailing opening fails the relevant scan unless flexible positions can match it.

## Complexity
- Time: $O(n)$ for the two scans.
- Auxiliary space: $O(1)$.
