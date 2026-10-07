# Explanation

## Idea
- Scan the original string while pointing to the next requested insertion index.
- Append a space before its character when the indices match, then append that character.

## Why It Works
- The insertion indices are sorted, so one forward pointer processes every requested space in order.
- Comparing against original character indices prevents earlier insertions from shifting later insertion positions.

## Edge Cases
- Index zero creates a leading space; consecutive indices insert spaces before consecutive characters.
- The pointer bound permits scanning after the final requested insertion.

## Complexity
- Time: $O(n + k)$ for `n` characters and `k` spaces.
- Space: $O(n + k)$ for the output builder and returned string.
