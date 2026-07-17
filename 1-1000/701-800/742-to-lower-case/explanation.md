# Explanation

## Idea

- Use Java's built-in `String.toLowerCase()`.
- Return the converted string directly.

## Why It Works

- The method converts uppercase letters to lowercase.
- Characters already lowercase or not letters remain unchanged under normal Java lowercase conversion.
- The problem only needs the converted string, not in-place mutation.

## Edge Cases

- Already lowercase strings return unchanged.
- Strings with printable non-letter ASCII characters keep those characters.
- Single-character strings work the same way.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the returned string.
