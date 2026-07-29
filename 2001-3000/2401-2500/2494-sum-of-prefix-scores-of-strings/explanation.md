# Sum of Prefix Scores of Strings

## Idea

- Insert every word into a trie.
- Each trie node stores how many words pass through that prefix.
- For each word, walk its trie path and sum the counts of all prefix nodes.

## Why It Works

- A node corresponds to one prefix.
- Incrementing `ct` during insertion records exactly how many words have that prefix.
- Summing the counts along a word's path adds the score of every non-empty prefix of that word.

## Edge Cases

- Duplicate words, if present, would increment the same path multiple times and be counted separately.
- A single word returns its length because each prefix count is `1`.
- The `find` method includes a null guard, though all queried words were inserted first.

## Complexity

- Time: `O(totalChars)`, for inserting and querying all words.
- Space: `O(totalChars)` for trie nodes.
