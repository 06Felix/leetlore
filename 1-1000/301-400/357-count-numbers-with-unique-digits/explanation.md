# Count Numbers with Unique Digits

## Idea

- Handle `n = 0` as the single number `0`.
- Start with `10` one-digit-or-less numbers.
- For each longer length, multiply the previous count by the remaining available digit choices.
- Add each length's count into `ans`.

## Why It Works

- For length `1`, digits `0` through `9` are valid.
- For length `2`, the first digit has `9` choices and the second has `9` choices.
- For each added digit after that, one fewer unused digit remains.
- Summing valid counts for lengths up to `n` gives all numbers in `[0, 10^n)`.

## Edge Cases

- `n = 0` returns `1`.
- The loop naturally stops after available unique digits run out.
- Constraint `n <= 8` stays within the simple combinatorial range.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
