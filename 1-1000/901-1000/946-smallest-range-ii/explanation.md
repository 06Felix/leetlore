# Smallest Range II

## Idea

- Sort `nums`.
- Consider a split where values up to `i` are increased by `k` and values after `i` are decreased by `k`.
- The possible minimum is `min(nums[0] + k, nums[i + 1] - k)`.
- The possible maximum is `max(nums[n - 1] - k, nums[i] + k)`.

## Why It Works

- After sorting, an optimal assignment can be seen as raising a prefix and lowering a suffix.
- The smallest final value must come from either the original minimum raised or the first lowered suffix value.
- The largest final value must come from either the original maximum lowered or the last raised prefix value.
- Trying every split covers all boundary choices.

## Edge Cases

- One element keeps range `0`.
- `k = 0` leaves the original range.
- The initial `ans` handles the no-improvement case.

## Complexity

- Time: $O(n \log n)$ from sorting.
- Space: $O(1)$ extra besides sorting implementation details.
