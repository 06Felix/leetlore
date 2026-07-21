# Number of Good Pairs

## Idea

- Scan numbers left to right.
- Keep a frequency map for values already seen.
- When reading `n`, increment its count.
- Add `count(n) - 1` to the answer for pairs ending at this index.

## Why It Works

- A good pair ending at the current index needs an earlier equal value.
- After incrementing, `count(n) - 1` is exactly the number of earlier occurrences.
- Summing this over all indexes counts every pair once, at its right endpoint.

## Edge Cases

- All distinct values add zero.
- All equal values add `0 + 1 + ... + n - 1`.
- Small constraints fit in `int`.

## Complexity

- Time: $O(n)$.
- Space: $O(u)$ for distinct values.
