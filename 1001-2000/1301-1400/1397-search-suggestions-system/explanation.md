# Search Suggestions System

## Idea

- Insert all products into a trie.
- Walk the trie along each prefix of `searchWord`.
- For every reachable prefix node, DFS through children in `a` to `z` order and collect up to three words.
- If a prefix path is missing, append empty lists for that and later prefixes.

## Why It Works

- A trie node represents all products sharing the prefix used to reach that node.
- DFS from that node visits only products with the current prefix.
- Children are stored in alphabetical index order, so DFS emits products lexicographically.
- Stopping after three words gives the required cap.

## Edge Cases

- If no product matches a prefix, all later prefixes also have no matches.
- A product equal to the prefix is added before longer descendants.
- Unique product strings avoid duplicate suggestions.

## Complexity

- Build time: $O(P)$ for total product length `P`.
- Query time: $O(L \cdot V)$ in the implementation, where `L` is `searchWord.length()` and `V` is the trie nodes visited before collecting three words per prefix.
- Space: $O(P)$ for the trie.
