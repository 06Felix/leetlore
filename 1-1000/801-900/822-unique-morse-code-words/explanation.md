# Explanation

## Idea

- Store the Morse code mapping for `a` through `z`.
- Convert each word by appending the code for every character.
- Insert each transformed string into a set.

## Why It Works

- A word's transformation is the concatenation of its letters' Morse encodings.
- The set removes duplicate transformations automatically.
- The set size is therefore the number of distinct transformations.

## Edge Cases

- A single word produces one transformation.
- Different words with the same transformation collapse to one set entry.
- All input characters are lowercase, matching the mapping indices.

## Complexity

- Time: $O(L)$, where `L` is the total number of characters.
- Space: $O(L)$ for stored transformed strings.
