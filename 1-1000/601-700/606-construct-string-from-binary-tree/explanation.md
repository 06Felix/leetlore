# Explanation

## Idea
- Recursively build the preorder representation of each subtree with a `StringBuilder`.
- When a right child exists, always emit both child groups, including an empty left group when needed. Otherwise emit only an existing left child.

## Why It Works
- Each node value precedes its children, and recursive calls encode each subtree using the same rules.
- The empty left group distinguishes a right-only child from a left-only child. Missing right groups and leaf groups can be omitted without ambiguity.

## Edge Cases
- A leaf produces only its value; a right-only node produces `value()(right)`.
- A null recursive child returns an empty builder; negative values retain their minus sign.

## Complexity
- Time: $O(nh)$ for height `h`, since child representations are copied into ancestor builders; this is $O(n^2)$ for a skewed tree.
- Space: $O(n)$ for live builders and the result, plus an $O(h)$ recursion stack, with bounded-size node values.

## Notes
- A skewed tree near the allowed 10000-node limit risks overflowing Java's recursion stack. The solution is preserved as imported.
