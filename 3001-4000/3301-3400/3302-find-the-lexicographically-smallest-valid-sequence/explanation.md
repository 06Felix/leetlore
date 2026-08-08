# Find the Lexicographically Smallest Valid Sequence

## Idea

We need indices from `word1` that form a subsequence almost equal to `word2`.

Almost equal means we may use at most one mismatch.

The answer must be the lexicographically smallest index array, so we want the first index as small as possible, then the second index as small as possible, and so on.

That suggests scanning `word1` from left to right and taking an index as soon as it is safe.

## Suffix Feasibility

Before building the answer, compute:

```text
suf[i] = how many characters from the end of word2 can be matched exactly using word1[i...]
```

This is done by scanning `word1` from right to left while matching `word2` from right to left.

`suf[i]` tells us whether the remaining part of `word2` can still be completed after choosing an index at position `i`.

## Greedy Construction

While scanning `word1` from left to right:

- If `word1[i]` matches the current needed character in `word2`, take it immediately.
- Otherwise, if the mismatch has not been used yet, take `i` only when the rest of `word2` can still be matched exactly.

For the mismatch case, after taking `i`, we need:

```text
m - j - 1
```

characters still matched from the suffix.

So the mismatch is safe only if:

```text
suf[i + 1] >= m - j - 1
```

## Why It Works

For lexicographically smallest arrays, earlier indices are always better.

When an exact match appears, taking it cannot use the one allowed mismatch, so it is always the best choice for the current position.

For a mismatch, taking it too early may block completion. The suffix check prevents that. If the suffix can still complete the remaining characters exactly, then using the mismatch at this earliest possible index gives the best lexicographic result.

## Edge Cases

- If no valid sequence can be completed, return an empty array.
- If no mismatch is needed, the method returns the smallest exact subsequence.
- Only one mismatch is allowed, tracked by `used`.

## Complexity

- Time: `O(n + m)`
- Space: `O(n)`

## Tags

- String
- Greedy
- Two Pointers
- Subsequence
- Prefix / Suffix
