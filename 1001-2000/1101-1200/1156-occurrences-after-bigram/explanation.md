# Occurrences After Bigram

## Idea

- Split `text` into words by spaces.
- Scan every consecutive triple of words.
- When the first two words match `first` and `second`, collect the third word.
- Convert the collected list into a string array.

## Why It Works

- The input guarantees words are separated by single spaces, so `split(" ")` gives exact token order.
- A valid occurrence is fully determined by indexes `i`, `i + 1`, and `i + 2`.
- Checking all `i < length - 2` covers every possible bigram followed by a third word.
- Appending in scan order preserves the required occurrence order.

## Edge Cases

- Text with fewer than three words returns an empty array.
- Overlapping occurrences are handled because the scan advances by one index.
- Repeated matching bigrams can add multiple third words.

## Complexity

- Time: $O(n)$ over the number of words.
- Space: $O(n)$ for split tokens and output.
