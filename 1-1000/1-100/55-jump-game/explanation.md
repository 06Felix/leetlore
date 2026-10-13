## Idea

- Scan while each index lies within the farthest reachable position. Extend that position with i+nums[i] and return true when the last index is visited.

## Why It Works

- Every index at most mx is reachable because jumps permit all intermediate lengths. Processing each reachable index adds exactly its possible extension. If the scan stops beyond mx, no processed position can reach further; reaching the last index proves success.

## Edge Cases

- A single-element array is already at the destination. A zero only blocks progress when no earlier jump reaches past it.

## Complexity

- O(n) time and O(1) space.
