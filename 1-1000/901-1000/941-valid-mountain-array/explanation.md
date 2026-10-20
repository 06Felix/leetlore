# Valid Mountain Array

## Idea

- Climb strictly increasing values from the left and strictly increasing values backward from the right. Accept only if both scans make progress and meet at the same interior index.

## Why It Works

- The left scan stops at the only possible end of an increasing prefix, while the right scan stops at the beginning of a decreasing suffix. Meeting internally means those two strict runs cover the complete array and share one valid peak.

## Edge Cases

- Arrays shorter than three fail. Flat sections and peaks at either endpoint fail.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input is unchanged; both comparisons are strict to exclude plateaus.
