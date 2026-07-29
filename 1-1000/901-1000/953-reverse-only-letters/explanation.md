# Reverse Only Letters

## Idea

- Use two pointers from both ends of the string.
- Move each pointer inward until it lands on a letter.
- Swap those letters in a `StringBuilder`.
- Leave non-letter characters untouched.

## Why It Works

- Reversing only letters means the first letter should swap with the last letter, the second with the second-last, and so on.
- Skipping non-letters preserves their original indices.
- The two-pointer process performs exactly those swaps until all letter positions are handled.

## Edge Cases

- Strings with no letters remain unchanged.
- Uppercase and lowercase letters are both accepted by `Character.isAlphabetic`.
- Non-letter punctuation and digits stay in place.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the mutable builder.
