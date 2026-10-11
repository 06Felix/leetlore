# Longest Unequal Adjacent Groups Subsequence II

## Idea
- Compute the longest valid subsequence ending at each word by checking every earlier word.
- Extend only across unequal groups, equal word lengths, and Hamming distance exactly one; store the winning predecessor.
- Reconstruct from a maximum-length endpoint and reverse the predecessor chain to restore input order.

## Why It Works
- Every nontrivial subsequence ending at an index has a valid earlier predecessor, and the DP examines all such possibilities.
- Using the predecessor's optimal length gives the best possible extension; singleton initialization covers words with no valid predecessor.
- Stored links encode exactly the tested adjacency conditions, so reconstruction returns a longest valid subsequence.

## Edge Cases
- Different-length words are rejected before computing Hamming distance; equal groups are always rejected.
- Tied optimal answers may choose any endpoint or predecessor. A single word returns a singleton subsequence.

## Complexity
- Time: $O(n^2L)$ for maximum word length $L$, plus linear reconstruction.
- Space: $O(n)$ for lengths, predecessors, and output references.
