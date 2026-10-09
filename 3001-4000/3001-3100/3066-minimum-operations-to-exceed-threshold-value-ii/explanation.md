## Idea
- Keep only values below k in a min heap. Combine the two smallest as 2x + y, reinserting the result only if it is still below k.
- Count each combination; if just one subthreshold value remains, count one final operation and stop.

## Why It Works
- While two subthreshold values exist, they are the two smallest values of the full multiset. Values already at least k never become subthreshold, so they need not be stored.
- With one subthreshold value left, combining it with any available value at least k clears it in one operation. The guaranteed existence of an answer ensures such a partner exists.
- Operations are forced by the two-smallest rule; stopping when no subthreshold value remains gives the minimum count.

## Edge Cases
- All values already at least k require zero operations.
- A newly combined value at least k is discarded. Long arithmetic avoids overflow in 2x + y; only values below k are cast back to int.

## Complexity
- O(n log(n + 1)) time for heap insertions and at most n - 1 combinations.
- O(n) auxiliary space; nums is unchanged.

## Notes
- The final single-value shortcut relies on the solvability guarantee. Without it, the method could report an operation when no second value exists.
