# All O`one Data Structure

## Idea

- Keep a doubly linked list of nonempty count buckets in increasing count order, with a key-to-bucket map. An increment or decrement moves a key to the adjacent count bucket, creating it if needed and removing empty old buckets.

## Why It Works

- Counts change by one, so any destination bucket must be the immediate neighboring count if it exists. Local insertion preserves sorted order, and the map always identifies the current bucket. The first and last real buckets therefore contain minimum and maximum keys.

## Edge Cases

- A decrement from one deletes the key. Empty structures return an empty string. Any key in a tied bucket is valid.

## Complexity

- Expected O(1) hash/list updates per operation under the usual hash-set model, and O(K) live entries/buckets for K keys. Java HashSet backing capacities may retain extra allocated storage after removals.

## Notes

- Extrema are obtained with HashSet.iterator().next(); iteration can scan unused buckets in a previously large sparse set, so strict constant-time extrema access depends on that library behavior. The actual source passed 5000 mixed differential operations.
