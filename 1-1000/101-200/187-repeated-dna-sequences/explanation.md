# Repeated DNA Sequences

## Idea

- The solution scans every substring of length `10`.
- `seen` stores sequences that have appeared at least once.
- `ans` stores sequences that are encountered again.
- At the end, the repeated sequences are returned as a list.

## Why It Works

- A DNA sequence is repeated exactly when the same 10-character substring appears at two or more starting positions.
- The first time a substring appears, it is recorded in `seen`.
- Any later occurrence of the same substring is added to `ans`.
- Using a set for `ans` prevents duplicates in the output even if a sequence appears many times.

## Edge Cases

- Strings shorter than `10` produce no loop iterations and return an empty list.
- A sequence repeated more than twice still appears once in the answer.
- Overlapping repeated substrings are handled because every starting index is checked.

## Complexity

- Time: $O(n)$ substrings of fixed length `10`.
- Space: $O(n)$ for the sets.
