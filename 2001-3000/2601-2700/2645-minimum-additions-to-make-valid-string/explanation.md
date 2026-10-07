# Explanation

## Idea
- Simulate complete `abc` blocks, visiting `a`, `b`, and `c` in that order.
- Consume the next input character when it matches the expected letter; otherwise count an insertion. Continue until the input is consumed, finishing the current block.

## Why It Works
- Every valid output is a repetition of `abc`. Matching an available expected letter immediately preserves the input as a subsequence without an insertion.
- When the next input letter differs, the expected letter must be inserted before that input can occupy its next compatible position. Completing the last block supplies any required trailing letters.

## Edge Cases
- An input already made of complete `abc` blocks needs no additions.
- Repeated equal letters require different blocks; a final `a` or `b` still incurs the missing block suffix.

## Complexity
- Time: $O(n)$, since each block consumes at least one input character and processes three expected letters.
- Auxiliary space: $O(1)$ for counters and the fixed three-letter array.
