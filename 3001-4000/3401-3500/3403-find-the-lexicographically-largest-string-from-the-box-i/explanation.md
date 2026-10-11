# Find the Lexicographically Largest String From the Box I

## Idea
- If there is one friend, return the whole word.
- Otherwise find its maximum character, then compare candidates starting with that character and extending up to `word.length - numFriends + 1`, or the end of the word.

## Why It Works
- A split part cannot exceed that length because every other friend needs at least one character. For a fixed start, its longest feasible part dominates all shorter prefixes lexicographically.
- Each candidate is feasible: its remaining characters can be divided among the other friends, with a truncated suffix using enough characters before it.
- A maximum starting character dominates every smaller starting character, so examining only its occurrences is sufficient.

## Edge Cases
- One friend permits only the whole word; as many friends as characters permits only one-character parts.
- The initial all-`a` candidate is a harmless lower bound: for an all-`a` word it is a prefix of an attainable longer candidate, and any larger first character defeats it.

## Complexity
- Time: $O(n^2)$ worst case for candidate substring copying and lexicographic comparisons.
- Space: $O(n)$ live storage for the character copy and candidate strings, with potentially quadratic total allocation over the scan.
