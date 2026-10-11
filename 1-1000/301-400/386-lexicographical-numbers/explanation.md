# Lexicographical Numbers

## Idea
- Start DFS from digits one through nine and append each valid number before visiting its digit extensions in order zero through nine.
- Stop once a number or extension exceeds `n`.

## Why It Works
- Decimal representations form a prefix tree; preorder visits a prefix before all longer strings starting with it.
- Increasing child digits and increasing root digits therefore produce lexicographical order. Every number has one unique decimal path.

## Edge Cases
- Zero is not a root, preventing leading zeros; roots above `n` return immediately.
- Once one child exceeds `n`, later children also exceed it and the loop can return.

## Complexity
- Time: $O(n)$ with constant branching per visited number.
- Space: $O(\log_{10}n)$ recursion depth in addition to the $O(n)$ output.

## Notes
- The recursive implementation does not meet the explicit requirement of $O(1)$ extra space: its call stack grows with digit count, even though the given bound keeps that depth small.
