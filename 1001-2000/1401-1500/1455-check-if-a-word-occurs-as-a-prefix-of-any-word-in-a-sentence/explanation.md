# Explanation

## Idea
- Split the sentence on spaces and inspect words in order with a one-based counter.
- Return the first word whose `indexOf(searchWord)` equals zero, or `-1` if none qualifies.

## Why It Works
- An occurrence beginning at zero is exactly a prefix match.
- Ordered scanning returns the minimum matching word index.

## Edge Cases
- A complete-word match qualifies; an occurrence later within a word does not.
- A longer search word cannot match a shorter sentence word.

## Complexity
- Time: $O(SP)$ as a conservative bound for `indexOf` searches, where `S` is sentence length and `P` search-word length.
- Auxiliary space: $O(S)$ for split words and their array.
