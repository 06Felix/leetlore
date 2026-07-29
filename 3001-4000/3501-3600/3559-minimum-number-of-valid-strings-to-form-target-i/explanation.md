# Explanation

## Idea

- Insert every word into a trie.
- Any path from the trie root represents a valid string, because every prefix of an inserted word is valid.
- Use DP where `dp[i]` is the minimum number of valid strings needed to form `target[0..i)`.
- From every reachable index `i`, walk the trie along `target[i..]` and relax every reachable end position.
- Return `dp[n]`, or `-1` if it stays unreachable.

## Why It Works

- The trie compactly represents all valid prefixes.
- If walking from `i` to `j` succeeds in the trie, then `target[i..j]` is a valid string that can be appended after a solution for `target[0..i)`.
- The DP considers every possible next valid string from every reachable prefix.
- Taking minimum transitions gives the fewest concatenated valid strings.

## Edge Cases

- If no trie edge matches from a reachable index, that path stops immediately.
- `dp[0] = 0` handles forming the empty prefix before any pieces.
- Unreachable final state returns `-1`.

## Complexity

- Time: `O(L + n^2)` in the worst case, where `L` is total word length and `n = target.length()`.
- Space: `O(L + n)`.

## Notes

- This imported Java file includes helper classes and an import line, but the explanation reflects the existing implementation without changing it.
