## Idea

- Trim surrounding spaces, copy the result to characters, and scan backward to the first remaining space. Return the length of the suffix after it.

## Why It Works

- Trimming makes the final character belong to the last word. The first space encountered from the end marks that word’s start, so the suffix length is exactly the answer.

## Edge Cases

- One word returns the whole trimmed length. Multiple internal spaces do not affect the final word.

## Complexity

- O(length) time and O(length) space for the trimmed string and character array.
