## Idea

- Insert words into a 26-way trie. Search recursively: follow one child for a letter or try all existing children for a dot, accepting only a terminal node at the pattern end.

## Why It Works

- Every letter consumes exactly its matching trie edge. A dot enumerates all permitted one-letter substitutions. Therefore successful terminal paths correspond exactly to stored words matching every pattern position.

## Edge Cases

- A prefix alone is not accepted. At most two dots limit branching under the given constraints.

## Complexity

- O(L) insert time; O(L·26^d) conservative search time for d dots; O(L) search stack and O(total stored characters) trie space.
