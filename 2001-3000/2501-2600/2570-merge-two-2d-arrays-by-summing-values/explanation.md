## Idea
- Merge the sorted ID sequences with two pointers.
- Equal IDs produce a new row with summed values; otherwise append the smaller-ID row. Append any remaining rows when one input is exhausted.

## Why It Works
- The smallest unprocessed ID must be at one of the two pointers, so each step preserves output order.
- Unique IDs within each input ensure an equal-ID step combines its only two contributions and emits that ID once.

## Edge Cases
- Disjoint inputs retain every row; fully shared IDs produce summed rows.
- Unequal input lengths are handled by the remaining-row loops.

## Complexity
- O(a + b) time and O(a + b) output/list storage.
- Nonmatching rows reuse input row references; only merged rows allocate new pairs.

## Notes
- The method does not mutate inputs, but its output aliases their nonmatching rows. Later row edits can therefore affect both output and input.
