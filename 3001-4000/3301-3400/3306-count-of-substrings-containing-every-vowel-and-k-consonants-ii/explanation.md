## Idea
- Count substrings containing all vowels and at least k consonants with a sliding window; subtract the analogous count for at least k + 1.
- For each right endpoint, while the window qualifies, add n - right and remove its leftmost character, maintaining vowel frequencies and consonant count.

## Why It Works
- Once a window qualifies, every extension to its right also qualifies, giving n - right endings for that left endpoint.
- Removing each left endpoint after counting it prevents duplicates. Subtracting nested at-least counts leaves exactly k consonants.

## Edge Cases
- k = 0 works with the same shrinking condition.
- Vowel multiplicities preserve coverage until their last occurrence is removed. Long stores the potentially quadratic answer.

## Complexity
- O(n) time for two sweeps; each pointer advances at most n times per sweep.
- O(n) auxiliary space for the character copy; frequency arrays use constant space.
