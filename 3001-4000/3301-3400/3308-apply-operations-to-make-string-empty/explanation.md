# Apply Operations to Make String Empty

## Idea

- The first pass counts each character and records the maximum frequency `mx`.
- Characters with frequency `mx` are exactly the ones present right before the final deletion round.
- The second pass walks left to right and appends a character when it reaches that character's last occurrence among the `mx` copies.
- The result preserves the order those final remaining characters have in the original string.

## Why It Works

- Each operation removes one occurrence of every present character.
- After `mx - 1` operations, only characters that originally appeared `mx` times can remain.
- For each such character, the remaining copy is its last original occurrence.
- Collecting those last occurrences in original order gives the string immediately before the final operation.

## Edge Cases

- If every character appears once, the original string is returned.
- If only one character has maximum frequency, the answer contains only its last occurrence.
- The implementation reuses the count array in the second pass by counting upward again from the first-pass totals.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ for the fixed character-count array.
