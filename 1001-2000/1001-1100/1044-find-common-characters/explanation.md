# Find Common Characters

## Idea

- Keep `commonCount[c]` as the minimum frequency seen for each lowercase letter.
- Initialize all frequencies to a large value, then count letters in each word.
- After each word, take the per-letter minimum with that word's count.
- Emit each character as many times as its final minimum frequency.

## Why It Works

- A character can appear in the answer only as often as it appears in every word.
- Taking the minimum frequency across all words gives exactly that shared duplicate count.
- Iterating from `'a'` to `'z'` creates one output string per required occurrence.

## Edge Cases

- With one word, the minimum counts become that word's own counts.
- Letters missing from any word get minimum count `0` and are not emitted.
- Duplicate common letters are preserved because the final count can be greater than `1`.

## Complexity

- Time: $O(T + 26n + A)$, where `T` is total input length and `A` is answer size.
- Space: $O(26 + A)$.
