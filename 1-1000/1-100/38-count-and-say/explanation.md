# Count and Say

## Idea
- Start with the string `1` and build the next term repeatedly until the requested term is reached.
- Scan maximal runs, appending each run's count followed by its digit to a new StringBuilder.

## Why It Works
- Advancing the inner index through equal neighboring characters consumes exactly one maximal run at a time.
- Appending count then digit applies the sequence's defining run-length encoding; iteration preserves the correct term by induction.

## Edge Cases
- `n = 1` performs no transformations and returns `1`.
- The neighbor bounds check handles the final run; the outer loop advances past each run after its encoding is appended.

## Complexity
- Time: $O(\sum_{t=1}^{n} L_t)$, where $L_t$ is the length of term $t$, including construction and final string conversion.
- Space: $O(\max_{t\le n}L_t)$ for the current and next builders; generation is iterative.
