# Explanation

## Idea

Put all words in a set, then test each word with recursive word-break logic. The helper tries every split into a prefix and suffix.

Memoization stores whether each suffix can be formed from dictionary words.

## Why It Works

A concatenated word must split at some position where the prefix is a dictionary word and the suffix is either a dictionary word or can itself be split further.

The loop checks every possible first split. Since the split index starts at `1` and stops before the full word, the word cannot count as itself without using at least one shorter prefix.

Memoization avoids recomputing the same suffix decisions.

## Edge Cases

- Reusing the same shorter word multiple times is allowed by the set lookup.
- Words with no valid split are memoized as false.
- Empty strings are not present under the constraints.

## Complexity

Time: roughly `O(W * L^2)` substring states across words, with `L <= 30`.

Space: `O(W * L)` for the set and memoized suffix strings.
