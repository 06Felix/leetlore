# Replace Words

## Idea

- Build a trie from every root in `dictionary`.
- Split the sentence into words.
- For each word, walk the trie until either a stored root is found or the path ends.
- Append the root if found; otherwise append the original word.

## Why It Works

- Trie traversal checks prefixes in increasing length order.
- The first trie node with `word != null` is the shortest matching root.
- If traversal cannot continue, no dictionary root is a prefix of that word.
- Rebuilding with a `StringBuilder` preserves word order and single spaces.

## Edge Cases

- Words with no root prefix remain unchanged.
- If multiple roots match, the shortest is returned because the search stops at the first terminal node.
- A word equal to a root returns the same text.

## Complexity

- Time: $O(D + S)$, where `D` is total dictionary length and `S` is sentence length.
- Space: $O(D + S)$ for the trie and rebuilt sentence.
