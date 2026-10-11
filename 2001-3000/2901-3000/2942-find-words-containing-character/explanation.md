# Find Words Containing Character

## Idea
- Check each word with `indexOf(x)` and append its index if a match exists.
- Traverse words in input order to return indices in ascending order.

## Why It Works
- A nonnegative search result means the word contains the requested character.
- Each word is checked once, so every qualifying index is returned exactly once regardless of repeated occurrences inside the word.

## Edge Cases
- Matches at the first or last position qualify; words without the character are skipped.
- No matching words returns an empty list.

## Complexity
- Time: $O(\sum_i |words[i]|)$ worst case for the searches.
- Space: $O(r)$ for $r$ returned indices, with $O(1)$ other auxiliary storage.
