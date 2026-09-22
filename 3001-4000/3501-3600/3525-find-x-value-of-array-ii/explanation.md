# Find X Value of Array II

## Idea

- After removing `nums[0...start - 1]`, the remaining array is `nums[start...n - 1]`.
- Removing one suffix from that array leaves a non-empty prefix of `nums[start...n - 1]`.
- So every query asks for the number of prefixes of a suffix range whose product has remainder `x`.
- Use a segment tree where each node stores prefix-product remainder counts.

## Why It Works

- For every segment, store `prod`, the product of the whole segment modulo `k`.
- Also store `cnt[r]`, the number of non-empty prefixes of that segment with product remainder `r`.
- When merging left and right segments, prefixes fully inside the left segment stay unchanged.
- Prefixes that enter the right segment get multiplied by the whole left product, so remainder `r` becomes `left.prod * r % k`.
- Point updates rebuild only `O(log n)` nodes, and suffix queries merge visited nodes from left to right.

## Edge Cases

- `k = 1` works naturally because every product has remainder `0`.
- `start = n - 1` queries only the final single element after the update.
- The update is applied before answering the current query and stays for later queries.

## Complexity

- Time: `O(k log n)` per update/query.
- Space: `O(n * k)`.

## Tags

- Segment Tree
- Modular Arithmetic
- Range Query
