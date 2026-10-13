## Idea

- Trim the input, split on single spaces, reverse the token array, and append nonblank tokens with one space each. Trim the final output.

## Why It Works

- Splitting preserves each word and may create empty tokens for repeated spaces. Reversal puts the word tokens in reverse order, and skipping blank tokens removes all empty separators. Final trimming removes the trailing space.

## Edge Cases

- Leading/trailing spaces and repeated internal spaces are normalized. Word characters retain their original order and case.

## Complexity

- O(length) time and O(length) space.

## Notes

- This implementation allocates split tokens and a result builder. The optional mutable-string O(1)-space follow-up is not implemented; Java String inputs are immutable.
