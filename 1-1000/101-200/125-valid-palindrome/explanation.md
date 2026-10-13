## Idea

- Use inward-moving pointers, skipping non-alphanumeric characters and comparing lowercase forms of each retained pair.

## Why It Works

- Removing punctuation does not affect which retained characters are mirrored. Every compared pair must match for the filtered lowercase string to be a palindrome; a mismatch proves it is not.

## Edge Cases

- All punctuation is accepted as an empty filtered string. Digits are retained, and case differences are ignored.

## Complexity

- O(length) time and O(1) auxiliary space.
