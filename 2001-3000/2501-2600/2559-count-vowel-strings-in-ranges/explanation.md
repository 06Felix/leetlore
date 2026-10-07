# Explanation

## Idea
- Mark a word as contributing one when its first and last letters both appear in the fixed vowel string.
- Build a prefix count array, then answer inclusive range `[l, r]` as `prefix[r + 1] - prefix[l]`.

## Why It Works
- The prefix at position `i` counts exactly the qualifying words before that index.
- Subtracting the prefix before `l` from the prefix through `r` cancels all words outside the requested interval.

## Edge Cases
- A one-letter vowel word qualifies because both endpoints are that vowel.
- Single-word queries and ranges starting at zero use the same formula with the leading zero prefix.

## Complexity
- Time: $O(n + q)$ for `n` words and `q` queries; endpoint checks search only five vowels.
- Space: $O(n)$ for prefixes, plus $O(q)$ for the returned answers.
