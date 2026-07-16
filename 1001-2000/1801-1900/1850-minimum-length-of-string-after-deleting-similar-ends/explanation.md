# Minimum Length of String After Deleting Similar Ends

## Idea

- The solution keeps two pointers at the current left and right ends.
- While both ends have the same character, it removes the whole matching run from the left and the whole matching run from the right.
- `len` is decreased for every removed character.
- When the ends differ or the pointers cross, no more valid deletion is possible.

## Why It Works

- A deletion can only happen when the current prefix and suffix use the same character.
- If the edge character matches, removing the maximal runs of that character is always optimal because partial removal would leave the same character at an edge.
- Once the current edge characters differ, no operation can satisfy the same-character prefix and suffix rule.
- The remaining `len` is therefore the minimum possible length.

## Edge Cases

- A string whose ends differ immediately returns its original length.
- If all characters can be removed, the pointers cross and `len` reaches `0`.
- The inner loops guard pointer crossing while deleting runs.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the character array.
