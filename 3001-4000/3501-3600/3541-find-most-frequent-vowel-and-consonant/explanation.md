## Idea

- Count all 26 letters, take the maximum among vowels and the maximum among consonants, then add them.

## Why It Works

- The two categories are disjoint and their maxima are chosen independently, exactly matching the required sum.

## Edge Cases

- An absent category contributes zero. Tied letters have equal frequency and need no tie-breaking.

## Complexity

- O(length+26) time and O(length+26) space, including the character array.
