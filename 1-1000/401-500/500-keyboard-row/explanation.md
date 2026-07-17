# Keyboard Row

## Idea

- The solution defines the three keyboard rows as strings.
- Each word is lowercased for case-insensitive checking.
- `check` verifies that every character of a word is contained in one row string.
- Words passing any row check are added to the answer.

## Why It Works

- A word can be typed on one row exactly when all its letters belong to the same row.
- Lowercasing makes uppercase and lowercase letters equivalent.
- Testing the word against all three row strings covers every possible row.
- The original word is stored in the result, preserving its input casing.

## Edge Cases

- Single-letter words always match one row.
- Mixed-case words are handled by lowercase conversion.
- Words spanning multiple rows fail all three checks.

## Complexity

- Time: $O(T)$ for total characters, with small constant row lookup cost.
- Space: $O(r)$ for the returned words.
