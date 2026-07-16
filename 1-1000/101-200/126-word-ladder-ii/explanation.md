# Word Ladder II

## Idea

- The C++ solution first runs BFS from `beginWord` and stores the shortest distance to each reached word in `mp`.
- Each BFS step tries changing every character to `'a'..'z'`.
- Once distances are known, DFS starts from `endWord` and walks backward to words with distance exactly one less.
- Each reversed sequence is flipped before being added to the answer.

## Why It Works

- BFS discovers words in increasing number of transformations, so `mp[word]` is the shortest distance from the start.
- Backward DFS only follows edges that decrease the distance by one, so every produced path is shortest.
- Trying all one-letter mutations during DFS enumerates all valid predecessor words on shortest paths.
- If `endWord` was never reached by BFS, there are no valid shortest sequences.

## Edge Cases

- If `endWord` is absent or unreachable, the result stays empty.
- Multiple shortest parents are all explored by the backward DFS.
- The word length is small, so generating all one-letter mutations is practical.

## Complexity

- Time: $O(N \cdot L \cdot 26 + P \cdot L \cdot 26)$, where `N` is dictionary size, `L` is word length, and `P` is the number of words visited across generated shortest paths.
- Space: $O(N + R \cdot L)$ for distances and returned paths.
