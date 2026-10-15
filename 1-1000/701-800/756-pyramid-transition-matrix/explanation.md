# Pyramid Transition Matrix

## Idea

- Store allowed top colors as bitmasks for each ordered bottom-color pair. Recursively build the next row one position at a time, trying every set bit; memoize completed row feasibility using its length and base-six encoding.

## Why It Works

- Every next-row block must be one of the colors allowed for its adjacent lower pair. Trying all such choices enumerates every legal next row, and recursion checks the remaining pyramid. A row determines all future possibilities, making the row cache valid.

## Edge Cases

- A single top block succeeds immediately. A pair with no allowed top rejects that branch. Pair order matters, so AB and BA use separate masks.

## Complexity

- For bottom length L <= 6, a conservative bound is O(L * 6^(2L)) time. Space is O(6^6 + L^2): cache tables are allocated for all lengths two through six, plus recursive row buffers.

## Notes

- mask is not cleared in the public method. Reusing the same Solution instance with different allowed lists retains earlier rules and can produce an incorrect result; a fresh instance avoids this risk. The feasibility cache itself is recreated each call.
