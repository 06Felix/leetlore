# Find First Palindromic String in the Array

## Idea

- The solution checks words from left to right.
- For each word, `isP` compares characters from both ends moving inward.
- The first word that passes the palindrome check is returned.
- If no word passes, the answer is the empty string.

## Why It Works

- The array order matters, so scanning left to right ensures the first valid palindrome is chosen.
- A string is a palindrome exactly when every mirrored character pair is equal.
- Returning immediately on the first valid word prevents later palindromes from replacing it.

## Edge Cases

- Single-character words are palindromes because the two-pointer loop does not find a mismatch.
- If every word fails, the method returns `""`.
- Words of even and odd length both work with the same two-pointer check.

## Complexity

- Time: $O(T)$, where `T` is the total number of characters checked.
- Space: $O(1)$.
