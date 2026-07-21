# Shortest Completing Word

## Idea

- Count required letters from `licensePlate`, ignoring digits and spaces and lowercasing letters.
- For each candidate word, count its letters.
- A word is complete when every required count is satisfied.
- Keep the shortest complete word seen so far.

## Why It Works

- The problem depends only on letter multiplicities, not order.
- `isComplete` compares required and candidate counts for all 26 letters.
- Scanning words in order and only replacing on strictly shorter length preserves the first among ties.
- The initial sentinel answer is longer than any valid word under the constraints.

## Edge Cases

- Repeated letters in the license plate require repeated letters in the word.
- Uppercase license letters are normalized with `toLowerCase`.
- Non-letters in the plate do not affect the requirement.

## Complexity

- Time: $O(P + W \cdot L)$ for plate length `P`, `W` words, and average word length `L`.
- Space: $O(26)$.
