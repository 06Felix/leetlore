# First Unique Character in a String

## Idea

- The solution counts occurrences of each lowercase letter in a fixed array of size `26`.
- It then scans the string from left to right.
- The first index whose character count is `1` is returned.
- If no such character exists, the answer is `-1`.

## Why It Works

- A character is unique exactly when its total count is one.
- The second scan checks indices in increasing order, so the first unique character found is the required earliest one.
- Since the alphabet is limited to lowercase English letters, direct indexing by `c - 'a'` is sufficient.

## Edge Cases

- Strings with all repeated characters return `-1`.
- A one-character string returns index `0`.
- Repeated characters before a later unique character are skipped by the count check.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ because the count array has fixed size.
