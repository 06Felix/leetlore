## Idea
- Read digits from right to left, keeping the adjusted digit on the right.
- If the current digit exceeds it, decrement the current digit, discard the already-built suffix, and record that all lower positions should become nine.
- Continue leftward to propagate violations, then fill the recorded suffix with nines.

## Why It Works
- At a descending adjacent pair, keeping the left digit would force a result greater than the input. Decrementing it is the smallest required reduction at that position.
- Once a prefix is reduced, filling its suffix with nines maximizes the result. Further leftward checks propagate any new descent caused by a decrement, as in 332 becoming 299.

## Edge Cases
- Zero returns zero without entering the loop.
- Already monotone digits remain unchanged; powers of ten become one less, such as 100 becoming 99.

## Complexity
- O(d) time for d decimal digits and O(1) auxiliary space.
- The input bound limits the calculation to at most ten digits.

## Notes
- For input 10^9, the final unused pow *= 10 overflows int after its highest digit has been processed. That value is never used again, so it does not affect this result, but the arithmetic is not safe for a generalized larger input range.
