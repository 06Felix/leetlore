# Magical String

## Idea
- Seed a builder with `" 122"`, using a leading space for one-based indexing.
- Read each run length at index `i` from 3 through `n`. Append that many `1`s for odd run indices or `2`s for even ones, then count `1`s in positions 1 through `n`.

## Why It Works
- The seed represents the first two runs: one `1` followed by two `2`s. Index 3 supplies the length of the next run.
- Runs alternate symbols, and their lengths are the magical string itself. Reading the next stored length and appending the corresponding alternating run preserves both requirements.
- The builder stays ahead of the read position, so every run length is available before it is consumed.

## Edge Cases
- `n = 1` and `n = 2` use only the seed; the leading space is excluded from the count.
- Generation intentionally extends beyond the requested prefix. The final count ignores every position after `n`.

## Complexity
- $O(n)$ time: each iteration appends at most two characters, followed by one prefix scan.
- $O(n)$ auxiliary space for the builder.
