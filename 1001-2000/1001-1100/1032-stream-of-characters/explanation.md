# Stream of Characters

## Idea

- Insert every word into a trie in reverse order. Append each queried character to a StringBuilder, then walk backward through the stream along trie edges until a word end succeeds or a missing edge fails.

## Why It Works

- A suffix of the forward stream becomes a prefix when read backward. The reversed trie therefore recognizes exactly dictionary words ending at the newest character; terminal nodes identify completed matching suffixes.

## Edge Cases

- A one-letter word can match immediately. Missing an edge rules out every longer suffix along that path. Overlapping words and matches across queries are supported.

## Complexity

- O(T) construction time, amortized O(L) query time, and O(T + Q) space for total word length T, maximum word length L, and Q queries. Trie traversal is bounded by L, though appending occasionally resizes the builder.

## Notes

- The implementation retains the entire character stream rather than trimming it to L characters, so stream storage grows with query count.
