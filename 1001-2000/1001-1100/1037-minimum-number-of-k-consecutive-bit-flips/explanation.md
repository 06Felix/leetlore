# Minimum Number of K Consecutive Bit Flips

## Idea

- Sweep left to right and decide flips greedily.
- `flippedTime` tracks how many active flips affect the current index.
- Mark a flip start by setting `nums[i] = 2`.
- When index `i` moves past a marked flip start at `i - k`, decrement `flippedTime`.

## Why It Works

- At position `i`, no later flip can change `nums[i]`, so if it is effectively `0`, a flip must start at `i`.
- The current effective bit is determined by the parity of active flips.
- If a required flip would extend past the array, the task is impossible.
- Greedily fixing the first unresolved zero gives the minimum number of flips because each such flip is forced.

## Edge Cases

- `k = 1` flips every zero independently.
- If the last required flip cannot fit, the method returns `-1`.
- The method mutates `nums` by using `2` as an internal marker.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ extra.
