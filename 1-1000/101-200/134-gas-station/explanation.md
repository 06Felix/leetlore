## Idea

- Reject a negative total gas surplus. Otherwise scan a candidate starting station, resetting it to the next station whenever its current fuel becomes negative.

## Why It Works

- If the segment from the candidate through i has negative total, every start within that segment also fails by i: removing a nonnegative earlier prefix cannot fix the deficit. Skipping that entire segment preserves all viable candidates. A nonnegative global surplus ensures the final candidate can finish the wrapped circuit.

## Edge Cases

- A single station succeeds exactly when its gas covers its cost. Zero net surplus is sufficient when the candidate’s prefixes stay nonnegative.

## Complexity

- O(n) time over two scans and O(1) space.
