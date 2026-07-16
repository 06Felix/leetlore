# Contains Duplicate III

## Idea

- The implementation maintains a sliding window of at most `indexDiff` previous values in a `TreeSet`.
- For each current value, it checks the closest set value greater than or equal to it with `ceiling`.
- It also checks the closest set value less than or equal to it with `floor`.
- If either nearest value differs by at most `valueDiff`, a valid pair exists.

## Why It Works

- The sliding window contains exactly prior indices that are close enough by index.
- In sorted order, any value within `valueDiff` must be detected by either the nearest lower value or nearest higher value.
- Removing `nums[i - indexDiff]` after insertion keeps future windows within the allowed index distance.
- Storing values as `long` avoids overflow when comparing large differences.

## Edge Cases

- Equal values are found when `valueDiff = 0`.
- Negative numbers work because ordering is handled by `TreeSet<Long>`.
- If no nearby value satisfies the bound, the scan finishes with `false`.

## Complexity

- Time: $O(n \log k)$, where `k = indexDiff`.
- Space: $O(k)$.
