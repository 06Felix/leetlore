# Extra Characters in a String

## Idea

- Store dictionary words in a hash set.
- Let `dp[i]` be the minimum extra characters needed for prefix `s[0..i)`.
- For every split `j < i`, either `s[j..i)` is a dictionary word and adds no extras, or it contributes its full length as extras.

## Why It Works

- Every optimal decomposition of the first `i` characters ends with some final segment `s[j..i)`.
- If that segment is in the dictionary, the best cost is `dp[j]`.
- Otherwise, this implementation treats that whole segment as extra and combines it with `dp[j]`.
- Trying all `j` covers all possible final segments.

## Edge Cases

- If no dictionary word is useful, single-character extra segments can build the answer.
- A dictionary word matching the full string can make `dp[n] = 0`.
- Duplicate dictionary handling is unnecessary because the input dictionary is distinct.

## Complexity

- Time: `O(n^3)` in Java due to substring creation inside the nested loops, with `n <= 50`.
- Space: `O(n + d)`, where `d` is the dictionary size.
