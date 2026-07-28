# Explanation

## Idea

Count each value frequency. Then try possible minimum group sizes from the smallest frequency down to `1`.

For a candidate size `s`, each value's frequency must be split into groups of size `s` or `s + 1`.

## Why It Works

All groups across the assignment may differ in size by at most one, so choosing the smaller size `s` fixes the only allowed group sizes.

For a frequency `freq`, the code first uses as many groups of size `s + 1` as possible. If the remainder is zero, that value is valid. Otherwise, the remainder must be distributable by converting some larger groups into size `s` groups.

Trying larger `s` first minimizes the number of groups, so the first valid candidate gives the answer.

## Edge Cases

- A frequency smaller than a candidate size cannot occur because candidates start at the minimum frequency.
- Singletons are always valid when `s = 1`.
- The fallback return is unreachable for valid inputs.

## Complexity

Time: `O(U * F)`, where `U` is the number of distinct values and `F` is the minimum frequency.

Space: `O(U)`.
