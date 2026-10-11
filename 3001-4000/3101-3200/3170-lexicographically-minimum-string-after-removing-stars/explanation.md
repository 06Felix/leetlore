# Lexicographically Minimum String After Removing Stars

## Idea
- Keep unmatched indices in one list per letter, scanning stars from left to right.
- For each star, remove the rightmost occurrence of the smallest available letter and mark both positions with spaces; strip those spaces at the end.

## Why It Works
- The letter lists contain exactly the surviving characters to the current star's left, so choosing the first nonempty list obeys the removal rule.
- Among equal smallest letters, deleting the rightmost preserves the earliest small character and yields the lexicographically best remainder. Future stars see the same available letter counts regardless of this tie choice.

## Edge Cases
- The input guarantee ensures a nonempty letter list exists for every star.
- With no stars, all characters survive; repeated stars consume the currently smallest surviving letters independently.

## Complexity
- Time: $O(26n)$ including scans for the smallest available letter and final filtering.
- Space: $O(n)$ for index lists, copied characters, mutable buffer, and result.
