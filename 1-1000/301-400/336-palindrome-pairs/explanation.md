# Palindrome Pairs

## Idea

- Map each reversed word to its original index.
- For every word, split it into left `l` and right `r` parts.
- If `r` is a palindrome and reversed `l` exists, append that word after current.
- If `l` is a palindrome and reversed `r` exists, prepend that word before current.

## Why It Works

- For `word + other` to be a palindrome, the unmatched prefix of `word` must be matched by `other`, and the remaining suffix must already be palindromic.
- The reversed-word map lets the code find that matching `other` directly.
- Checking every split covers every place where the mirror boundary can fall.
- The empty-string case is handled separately for palindromic words.

## Edge Cases

- Empty string pairs with every palindromic word.
- The code avoids pairing a word with itself.
- Splits from `1` through `word.length()` cover non-empty prefixes and possibly empty suffixes.

## Complexity

- Time: $O(nL^2)$ because each split creates substrings and may run a palindrome check.
- Space: $O(nL)$ for reversed words and output.

## Notes

- This implementation is not the linear-time trie approach mentioned by the problem target; it is a direct split-and-map solution.
