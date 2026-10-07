# Explanation

## Idea
- Split both strings at fixed boundaries into blocks of length `n / k`.
- Build a frequency map of exact block contents for each string and compare the maps.

## Why It Works
- Equal-size partitioning fixes the block boundaries; only their order may change, not their contents.
- Rearrangement preserves the multiset of blocks, making equal maps necessary.
- When maps match, each target block can be supplied by an available source occurrence, making them sufficient as well.

## Edge Cases
- Duplicate blocks require matching counts, not just matching membership.
- `k = 1` requires identical full strings; `k = n` compares character multisets, which match under the anagram guarantee.

## Complexity
- Expected time: $O(n)$ for copied block characters, hashing, and map comparison.
- Auxiliary space: $O(n)$ for block strings and frequency maps.
