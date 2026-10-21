# Decode String

## Idea
- Parse recursively using an instance cursor `i`. Append letters directly; read consecutive digits as a repetition count.
- Skip `[`, recursively decode until `]`, skip that closing bracket, then append the decoded group the requested number of times.

## Why It Works
- Each call consumes exactly the contents of its current bracket level, leaving its closing bracket for the caller to skip.
- Valid encoding ensures every count has a matching group. Recursively decoded groups are repeated before parsing resumes, preserving nesting and concatenation order.

## Edge Cases
- Multi-digit counts, adjacent groups, literal suffixes, and nested repetitions are supported.
- A plain letter-only string is copied directly; recursion ends at a closing bracket or the input end.

## Complexity
- $O(N+D\cdot L)$ time as a conservative bound, where $N$ is encoded length, $L$ is decoded length, and $D$ is nesting depth; intermediate expansions can be copied at multiple levels.
- $O(N+D\cdot L)$ auxiliary storage is a conservative bound for recursion and live builders/decoded strings.

## Notes
- Instance-reuse risk: `i` is not reset before a new top-level call. On the same object, decoding `"a"` followed by `"b"` returns an empty string for the second call. A fresh instance correctly handles one input.
