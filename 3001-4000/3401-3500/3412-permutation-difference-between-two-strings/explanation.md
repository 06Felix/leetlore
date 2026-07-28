# Permutation Difference between Two Strings

## Idea

- Store each character's index in `s` in a 26-entry array.
- Scan `t`, look up the same character's original index, and add the absolute index difference.
- Return the accumulated sum.

## Why It Works

- Each lowercase character appears at most once, so one stored position per character is enough.
- Since `t` is a permutation of `s`, every character scanned in `t` has a valid position in `s`.
- Summing `abs(i - pos[ch])` over all characters is exactly the permutation difference definition.

## Edge Cases

- Length `1` strings return `0` because the only character has the same index.
- Fully reversed strings work because each character is independently compared.
- Missing-character handling is unnecessary under the permutation constraint.

## Complexity

- Time: `O(n)`, where `n` is `s.length()`.
- Space: `O(1)` for the fixed 26-entry position array.
