## Idea
- Slide a window of length k, counting white blocks as the right endpoint advances.
- Record the count for each complete window, then remove its leftmost block before advancing the left endpoint.

## Why It Works
- Turning a given window fully black requires exactly one recolor per white block in it.
- Every candidate window is examined once, so their minimum white count is the minimum required number of operations.

## Edge Cases
- An already-black window gives zero.
- k = n tests the whole string; k = 1 finds whether any single black block exists.

## Complexity
- O(n) time for one window sweep.
- O(n) auxiliary space for the character-array copy; counters use O(1) space.
