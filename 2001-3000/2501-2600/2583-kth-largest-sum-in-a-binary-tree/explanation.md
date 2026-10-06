# Explanation

## Idea
- Traverse the tree one level at a time with a queue and insert each level's `long` sum into a max-heap.
- If there are at least `k` levels, discard the largest `k - 1` sums and return the next one.

## Why It Works
- Capturing the queue size before each inner loop separates the current level from children enqueued for the next level.
- The heap orders all level sums from largest to smallest, including repeated sums as separate entries.
- Removing exactly `k - 1` entries leaves the requested ranked sum at the top.

## Edge Cases
- Fewer than `k` levels return `-1`; `k = 1` returns the maximum without discarding entries.
- Level sums can exceed `int`, so the implementation accumulates and stores them as `long`.

## Complexity
- Time: $O(n + (L + k) \log(L + 1))$ when a result exists, where `L` is the number of levels; an unavailable rank needs no heap removals.
- Auxiliary space: $O(W + L)$ for maximum queue width `W` and all level sums.
