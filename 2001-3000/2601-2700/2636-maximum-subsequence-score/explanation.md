# Maximum Subsequence Score

## Idea

- Pair each index as `(nums2[i], nums1[i])`.
- Sort pairs by `nums2` descending.
- Sweep in that order while keeping the largest `k` seen `nums1` values in a min-heap.
- When the heap has size `k`, use the current `nums2` as the minimum multiplier candidate.

## Why It Works

- During the descending sweep, every previously seen pair has `nums2 >= current nums2`.
- If a subsequence uses the current pair as the minimum `nums2`, the best sum uses the largest `k` `nums1` values among seen pairs.
- The min-heap maintains exactly those largest `k` `nums1` values by removing the smallest when size exceeds `k`.
- Checking every possible minimum `nums2` finds the maximum score.

## Edge Cases

- `k = 1` reduces to maximizing `nums1[i] * nums2[i]`.
- Zero values are handled naturally by the sum and product.
- The answer uses `long` because the product can exceed `int`.

## Complexity

- Time: $O(n \log n + n \log k)$.
- Space: $O(n + k)$ for pairs and heap.

## Notes

- The submitted code uses `Pair<Integer, Integer>`, which is accepted only where that helper type is available.
