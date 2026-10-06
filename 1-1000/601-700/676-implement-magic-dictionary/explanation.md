# Explanation

## Idea
- Build a trie of dictionary words and mark complete-word endpoints.
- Walk the search word's unchanged prefix. At each position, try every other available letter and check the remaining suffix with exact trie traversal.
- Return true only if one replacement reaches a complete dictionary word.

## Why It Works
- A successful branch changes exactly the tested position: its prefix and suffix match unchanged.
- Trying every different letter at every position covers every possible single-character replacement.
- The terminal-word check rejects prefixes of longer words, while rejecting the unchanged letter prevents zero-change matches.

## Edge Cases
- An exact dictionary match alone returns false; it can return true if another dictionary word differs by exactly one character.
- A missing unchanged-prefix edge ends the search only after all replacements at that position have been tested.

## Complexity
- Build: $O(T)$ time and space for `T` total dictionary characters, with a fixed 26-letter alphabet.
- Search: $O(26L^2)$ worst-case time for length `L`, since each replacement can scan the remaining suffix.
- Search auxiliary space: $O(1)$; the searches are iterative.
