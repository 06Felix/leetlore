# Explanation

## Idea
- For each word, insert every nonempty suffix followed by `{` and then the full word into a 27-way trie.
- Store the word's index on every traversed node, overwriting earlier indices as words are inserted in increasing order.
- Answer a query by traversing `suffix + "{" + prefix` and returning its stored index, or `-1` if an edge is missing.

## Why It Works
- Reaching `{` requires matching a complete inserted suffix; the letters after it match the original word's prefix.
- Each matching word therefore traverses the query path, and unrelated words do not.
- Later insertions overwrite indices, so the final stored value is the largest matching dictionary index.

## Edge Cases
- Duplicate words correctly retain their latest index; prefix and suffix may overlap in the same word.
- `{` is outside the lowercase alphabet and occupies child slot 26. Empty suffixes are not inserted, consistent with the nonempty-query constraints.

## Complexity
- Build: $O(WL^2)$ time and space for `W` words of maximum length `L`, including inserted trie characters.
- Query: $O(P + S)$ time for prefix length `P` and suffix length `S`.
- Query auxiliary space: $O(P + S)$ for the concatenated key and its `toCharArray()` copy.
