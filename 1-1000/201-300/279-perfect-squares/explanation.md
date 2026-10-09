## Idea
- Store all positive squares at most n in a set.
- Try answer lengths starting at one. Recursively choose squares until one choice remains, then test whether the remaining sum is itself a square.

## Why It Works
- Recursion explores every ordered selection of the requested number of positive squares, ignoring a square only when it exceeds the remaining sum.
- Testing lengths in increasing order makes the first successful length the minimum. A representation always exists using n ones.

## Edge Cases
- A perfect square returns one.
- Squares may be reused, as required for 12 = 4 + 4 + 4; an exhausted remainder cannot succeed with a positive square still required.

## Complexity
- Let S = floor(sqrt(n)). The four-square theorem bounds the successful answer by four; searching up to that point costs O(S³) expected time in the worst case, including set iteration.
- O(S) auxiliary space for the square set, plus recursion depth at most four on valid inputs.

## Notes
- No memoization is used, so many equivalent remaining-sum states are explored repeatedly.
- The set persists between calls, but larger old squares are filtered by sq <= remaining. The arbitrary fallback 7163846 is unreachable for valid positive inputs.
