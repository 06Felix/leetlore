# Explanation

## Idea

- Convert the string to a character array.
- Scan for spaces to identify each word boundary.
- Reverse each word segment in place, then build a new string from the array.

## Why It Works

- Words are separated by single spaces with no leading or trailing spaces.
- Reversing only the segment between two spaces changes character order inside that word.
- Spaces are never moved, so original word order and whitespace positions are preserved.
- After the loop, the final word is reversed separately because it is not followed by a space.

## Edge Cases

- A single-word string is handled by the final reverse call.
- One-character words reverse to themselves.
- The last word is not skipped.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the character array and returned string.
