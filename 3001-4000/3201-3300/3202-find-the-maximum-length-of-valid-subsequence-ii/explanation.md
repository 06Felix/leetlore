## Idea

- For each target remainder, extend DP states from the complementary remainder.

## Why It Works

- Fixing the target determines the only compatible predecessor remainder.

## Edge Cases

- Boundary cases are handled directly by the scan or recurrence.

## Complexity

- O(nk+k^2) time, O(k) space.
