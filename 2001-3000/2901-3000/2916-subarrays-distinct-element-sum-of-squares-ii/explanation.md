# 2916. Subarrays Distinct Element Sum of Squares II

## Idea

- Process subarrays by their right endpoint. For the current endpoint `i`, keep the distinct count of every subarray `nums[start..i]`.
- If `nums[i]` last appeared at `prev`, it is new exactly for starts in `[prev + 1, i]`. Their distinct count increases by one.
- A lazy segment tree applies that range increment and stores both the sum of counts and the sum of squared counts.

## Why It Works

- When a count `d` becomes `d + 1`, its square changes by `(d + 1)^2 - d^2 = 2d + 1`.
- For a segment containing several starts, the tree can update its squared-count sum using its current count sum: `squareSum += 2 * countSum + segmentLength`.
- After processing `i`, the root's squared-count sum is the total contribution of every subarray ending at `i`. Add it to the answer.

## Edge Cases

- A value appearing for the first time has `prev = -1`, so every subarray ending at this index gains a new distinct value.
- Repeated values affect only starts after their previous occurrence.
- All tree values are kept modulo `1_000_000_007`.

## Complexity

- Time: `O(n log n)`
- Space: `O(n)`

## Tags

- Segment Tree
- Lazy Propagation
- Hash Table
- Array
