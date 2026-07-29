# Explanation

## Idea

- If both raw strings have equal length, compare them directly.
- Split both sentences into words and ensure `w1` is the shorter sentence.
- Match a common prefix from the start.
- Then match the remaining shorter-sentence words against the suffix of the longer sentence.
- If every word in the shorter sentence is covered, the longer sentence only has one inserted middle block.

## Why It Works

- One insertion can only add a contiguous block while preserving a prefix and suffix of the original sentence.
- The first loop consumes the maximum common prefix.
- The second loop consumes a matching suffix, offset by the length difference.
- If the shorter sentence is fully consumed, all unmatched words form one insertable block in the longer sentence.

## Edge Cases

- Equal sentences return true from the direct comparison.
- Insertions at the beginning or end work because the prefix or suffix part can be empty.
- Word splitting prevents partial-word matches from being treated as similar.

## Complexity

- Time: `O(m + n)` over the words.
- Space: `O(m + n)` for split arrays.
