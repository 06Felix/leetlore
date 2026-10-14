## Idea

- Maintain one path-count array by column. Set an obstacle’s count to zero; otherwise add the left count to the existing upper count. Seed the origin with one potential path.

## Why It Works

- Before an update, dp[j] counts arrivals from the preceding row and dp[j−1] counts arrivals from the current row’s left cell. Their disjoint routes are all possible arrivals. Obstacles block every route through that cell.

## Edge Cases

- A blocked origin clears the seed; a blocked destination returns zero. First-column counts propagate vertically unless blocked.

## Complexity

- O(rows·columns) time and O(columns) space.
