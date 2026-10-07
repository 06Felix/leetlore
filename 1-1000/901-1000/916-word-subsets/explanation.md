# Explanation

## Idea
- Count each word in `words2` and merge its letter requirements using a per-letter maximum.
- Count each candidate from `words1` and keep it when every count meets the merged requirement.

## Why It Works
- A candidate contains every requirement word exactly when its count for each letter is at least the largest demand for that letter across those words.
- Maxima preserve multiplicity without incorrectly summing demands from independent requirement words. Comparing all 26 letters therefore identifies exactly the universal candidates.

## Edge Cases
- Repeated letters within one requirement raise the required multiplicity.
- Repeating a requirement word does not raise the demand; a shortage of any one letter rejects a candidate.

## Complexity
- Time: $O(S_1 + S_2 + 26(n_1 + n_2))$ for total character counts `S1`, `S2` and word counts `n1`, `n2`.
- Auxiliary space: $O(26 + L)$ for frequency arrays and a temporary `toCharArray` of maximum word length `L`, plus $O(n_1)$ returned references.
