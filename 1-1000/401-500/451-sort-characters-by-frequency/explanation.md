# Sort Characters By Frequency

## Idea

- The implementation counts characters in an ASCII-sized array.
- It places each present character into a bucket indexed by its frequency.
- It scans buckets from highest frequency down to lowest.
- For each character in a bucket, it appends that character `freq` times.

## Why It Works

- Characters in higher-frequency buckets must appear earlier in the output.
- Scanning frequencies descending guarantees the required ordering by frequency.
- All occurrences of the same character are appended together.
- Ties can appear in any order, which the problem allows.

## Edge Cases

- A one-character string returns itself.
- Uppercase and lowercase letters are counted separately by character code.
- Digits are handled by the same ASCII count array.

## Complexity

- Time: $O(n + A)$, where `A = 128` for the count scan.
- Space: $O(n + A)$ for buckets and the output builder.
