# Explanation

## Idea
- Insert all candidate words into a trie, counting duplicate words at their terminal nodes.
- Recursively explore trie edges by finding the earliest matching character in `s` at or after the current source position.
- Add each reached node's terminal count, then continue searching after the matched character.

## Why It Works
- Choosing the earliest available match leaves at least as much remaining source text as any later match, so it cannot prevent an otherwise valid completion.
- A trie node is reached exactly when its prefix is a subsequence; its terminal count contributes all matching occurrences of that word.
- Shared prefixes are traversed once and branches with no next match are rejected.

## Edge Cases
- Duplicate candidate words count separately through the terminal counter.
- Repeated letters require increasing source positions; words needing more characters than remain cannot be completed.

## Complexity
- Build: $O(T)$ time and space for total candidate length `T`, with a fixed 26-letter alphabet.
- Search: $O(S T)$ worst-case time for source length `S`, because each examined trie edge can call a linear `indexOf` scan.
- Search stack: $O(L)$ for maximum candidate length `L`, in addition to the trie.

## Notes
- Repeated suffix scans can be expensive under the largest constraints; this is not a linear waiting-bucket implementation.
- The trie is an instance field and is not cleared, so reusing a `Solution` object accumulates earlier words and their counts.
