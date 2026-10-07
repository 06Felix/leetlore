# Explanation

## Idea
- For each word, search every other word using `indexOf`.
- Add the candidate after its first successful substring match and stop searching for that candidate.

## Why It Works
- Every possible containing word is checked except the candidate itself.
- A nonnegative substring position proves the required inclusion. Breaking after the first match includes each qualifying word exactly once.

## Edge Cases
- A single-word array returns an empty list.
- A word contained in several other words is still added only once; the statement guarantees unique input words.

## Complexity
- Time: $O(n^2L^2)$ as a conservative bound for substring searches with maximum word length `L`.
- Space: $O(n)$ for returned word references and $O(1)$ additional loop storage.
