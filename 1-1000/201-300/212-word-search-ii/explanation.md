## Idea

- Build a dictionary trie, then backtrack from every board cell while following trie prefixes. Mark a cell * during the current path and restore it afterward. Emit terminal words and clear their markers to avoid duplicates.

## Why It Works

- Every explored path uses adjacent cells and never repeats a marked cell. Trie pruning rejects paths that cannot form a dictionary word without losing any valid word. Starting at every cell covers all possible first positions; clearing terminal markers ensures each found word appears once.

## Edge Cases

- Different words may share prefixes, so finding a word does not stop exploring its descendants. The board is restored after each path.

## Complexity

- O(S+rows·columns·4^L) conservative time for S dictionary characters and maximum word length L; O(S+L) auxiliary space plus output.

## Notes

- State reuse risk: root is an instance field not rebuilt for each findWords call. Unfound words from an earlier dictionary may be returned on a later call with a different dictionary; the stored implementation is unchanged.
