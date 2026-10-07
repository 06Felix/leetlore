# Explanation

## Idea
- Scan left to right, tracking unmatched source `R` pieces and unmatched target `L` positions.
- Pair each target `R` with an earlier available source `R`, and each source `L` with an earlier target `L`. Reject crossing demands and require both counters to finish at zero.

## Why It Works
- An `R` must originate at or left of its destination, while an `L` must end at or left of its origin; the counter checks enforce those directions.
- Rejecting an `R` while an `L` destination is pending, or a target `L` while an `R` is pending, prevents pieces from crossing and preserves their relative order.
- Balanced counters account for every piece, making these direction and order conditions sufficient for a legal sequence of moves.

## Edge Cases
- Identical strings return true immediately, including all blanks.
- Missing pieces, reversed piece order, and moves in the forbidden direction fail the counter checks.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(1)$.
