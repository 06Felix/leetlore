# Explanation

## Idea
- Count each distinct word, then place it in the bucket indexed by its frequency.
- Visit buckets from highest frequency to lowest, sort each visited bucket lexicographically, and collect words until `k` are returned.

## Why It Works
- Descending bucket order puts every more frequent word before less frequent words.
- Sorting within a bucket enforces the alphabetical tie rule.
- Stopping after `k` entries selects exactly the first `k` words in the required combined ordering.

## Edge Cases
- Equal-frequency words are returned alphabetically, even when `k` cuts through their bucket.
- The guaranteed valid `k` makes the empty-list fallback unreachable for permitted input.

## Complexity
- Expected time: $O(N + U \log U)$ with bounded word length, where `N` is the input count and `U` the distinct-word count.
- Auxiliary space: $O(N + U)$ for the buckets and frequency map, excluding the output.

## Notes
- This implementation sorts whole visited buckets, so it does not meet the optional $O(N \log k)$ follow-up bound in general.
