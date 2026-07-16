# Explanation

## Idea

- Use BFS from `beginWord` to assign each reachable word its shortest distance.
- Generate neighbors by changing one character to each letter `a` through `z`.
- If `endWord` is reached, DFS backward from `endWord` to `beginWord`, only following words whose distance is exactly one less.

## Why It Works

- BFS records the first distance at which each word is discovered, so `mp[word]` is the shortest number of steps from `beginWord`.
- A valid shortest path ending at `word` must come from a neighbor with distance `mp[word] - 1`.
- The backward DFS enumerates all such predecessor choices and reverses each completed sequence before storing it.

## Edge Cases

- If `endWord` is not reached by BFS, the result stays empty.
- Removing words from `not_checked` prevents longer revisits from polluting shortest distances.
- `beginWord` is explicitly erased from the unchecked set to avoid cycling back to it during BFS.

## Complexity

- Time: $O(W \cdot L \cdot 26 + P \cdot L \cdot 26)$, where $W$ is word count, $L$ is word length, and $P$ is the number of words visited across generated output paths.
- Space: $O(W + R \cdot L)$ for distances, BFS storage, recursion, and returned paths.
