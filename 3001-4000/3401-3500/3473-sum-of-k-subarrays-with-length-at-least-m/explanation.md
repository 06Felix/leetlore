## Idea
- Build prefix sums and let dp[j][t] be the best sum of exactly t valid subarrays within the first j elements.
- For each t, sweep endpoints j while maintaining the greatest dp[p][t - 1] - prefix[p] over starts p <= j - m.
- Compare a subarray ending at j with skipping the final element; initialize zero-subarray states to zero and other states to a large negative sentinel.

## Why It Works
- A last segment [p, j) contributes prefix[j] - prefix[p] and requires all earlier segments to lie in the first p elements.
- The running maximum considers every permitted start in constant time per endpoint. The skip transition covers solutions whose last segment ends earlier, while the sentinel preserves the requirement of exactly k segments.

## Edge Cases
- Negative arrays can require a negative answer; selecting zero segments is not allowed for the final state.
- Adjacent segments are permitted, and lengths greater than m are included by retaining earlier starts.

## Complexity
- O(nk) time and O(nk) DP space, plus O(n) prefix sums.
- All feasible sums and sentinel arithmetic fit int under the stated bounds.
