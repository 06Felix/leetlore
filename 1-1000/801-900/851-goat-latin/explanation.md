# Goat Latin

## Idea

- Split the sentence into words.
- For each word, keep it unchanged if it starts with a vowel.
- Otherwise move its first letter to the end.
- Append `"ma"` plus one more `'a'` than the previous word index.

## Why It Works

- `isVowel` checks both lowercase and uppercase vowels.
- Consonant words are transformed by `substring(1) + firstChar`.
- The counter `i` starts at `1`, matching the problem's word indexing for appended `'a'` characters.
- Spaces are inserted before every word after the first, preserving sentence separation.

## Edge Cases

- One-word sentences do not get a leading space.
- Uppercase vowel starts are recognized.
- Single-letter consonant words become the same letter before `"ma"` and suffix `'a'`.

## Complexity

- Time: $O(n + w^2)$ in the implementation because `"a".repeat(i)` creates increasing suffixes.
- Space: $O(n + w^2)$ for the built result.
