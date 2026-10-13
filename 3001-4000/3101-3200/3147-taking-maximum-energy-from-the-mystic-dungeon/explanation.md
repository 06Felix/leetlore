## Idea

- Process indices backward, adding the already-computed total at i+k to energy[i]. Maximize over all starting indices.

## Why It Works

- A start’s forced journey consists of its own energy plus the forced journey at its next reachable index. Backward order computes that dependency first, so each updated entry is exactly its journey sum.

## Edge Cases

- The last k positions have no successor. All-negative input still chooses a real start because the maximum begins at Integer.MIN_VALUE.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input energy array is modified to hold journey sums.
