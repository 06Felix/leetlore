## Idea

- Require the target in the bank, then BFS one-character substitutions using A/C/G/T. Remove bank entries when enqueued and return the layer number when the target is generated.

## Why It Works

- Every candidate differs in exactly one position. The bank set admits only legal intermediate genes, and first discovery removes repeats. For distinct start and end, BFS’s first target discovery gives the fewest mutations.

## Edge Cases

- An absent distinct target is unreachable. Bank cycles do not cause unbounded exploration because entries are consumed once.

## Complexity

- O(B·L²) expected time for B bank genes and L=8 characters, including candidate-string creation; O(BL) space.

## Notes

- Correctness bug for an allowed equal-endpoint input: start=end with an empty bank should return zero, but the initial bank check returns −1. Even when start=end is in the bank, the method does not immediately return zero. The stored implementation is unchanged.
