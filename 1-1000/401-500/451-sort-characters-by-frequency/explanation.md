# Explanation

## Idea

- Count each ASCII character frequency in an array of size 128.
- Bucket characters by their frequency, where `buckets[f]` stores all characters seen `f` times.
- Walk frequencies from high to low and append each character repeated by its bucket index.

## Why It Works

- Every character is placed into exactly the bucket matching its total frequency.
- Iterating buckets from `n` down to `1` guarantees higher-frequency characters are appended first.
- Ties can appear in any order, which the problem allows.

## Edge Cases

- Single-character strings produce one non-empty bucket.
- Uppercase, lowercase, and digits remain distinct because counting is by character code.

## Complexity

- Time: $O(n + A)$, where $A = 128$ for the counted character range.
- Space: $O(n + A)$ for buckets, counts, and the output builder.
