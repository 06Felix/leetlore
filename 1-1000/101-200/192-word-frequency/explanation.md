# Word Frequency

## Idea

- The Bash pipeline turns spaces into newlines so each word is on its own line.
- It sorts the words to group equal words together.
- `uniq -c` counts each grouped word.
- A final reverse sort orders larger counts first, and `awk` prints `word count`.

## Why It Works

- Sorting places identical words next to each other, which is required for `uniq -c`.
- Since each frequency is unique by problem guarantee, reverse sorting the count-prefixed lines gives the required descending frequency order.
- `awk '{ print $2, $1 }'` swaps the default `uniq -c` output from `count word` to `word count`.

## Edge Cases

- `tr -s ' ' '\n'` handles runs of spaces by producing one separator.
- The input is guaranteed to contain only lowercase words and spaces, so no extra normalization is needed.
- Ties do not need special handling because the problem rules exclude them.

## Complexity

- Time: dominated by sorting, $O(n \log n)$ over the words.
- Space: depends on the Unix sort implementation and input size.
