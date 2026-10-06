# Explanation

## Idea
- Use a binary-search tails list to record the best strictly increasing subsequence length in every prefix.
- Reverse the input, compute the same prefix lengths, and reverse that result to obtain the best decreasing subsequence length in every original suffix.
- At each interior split with both lengths above one, maximize their sum minus one; remove everything outside the best mountain length.

## Why It Works
- Replacing the first tail not smaller than the current value preserves minimum tails for each length, so equal values do not extend a strictly increasing subsequence.
- An increasing subsequence from a prefix and a decreasing subsequence from its overlapping suffix can be joined at the larger endpoint. If their endpoints are equal, keep only one copy. This produces a mountain of at least the summed lengths minus one.
- Conversely, splitting any optimal mountain at its peak makes both computed lengths at least its two sides. Maximizing these candidate lengths therefore recovers the optimal mountain size.

## Edge Cases
- Requiring both lengths above one prevents a purely increasing or decreasing result.
- Duplicate values cannot extend the tails list; the problem guarantees that some mountain can be formed.

## Complexity
- Time: $O(n \log n)$ for two LIS passes and linear reversals.
- Auxiliary space: $O(n)$ for length arrays and the tails list.

## Notes
- `lis[i]` stores a prefix optimum, not necessarily the length of a subsequence ending at `i`.
- The helper reverses `nums` in place, and the original input order is not restored.
