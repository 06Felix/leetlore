# Simplified Fractions

## Idea

- Enumerate every denominator from `2` through `n`.
- For each denominator, try every numerator from `1` through `denominator - 1`.
- Add the fraction only when `gcd(numerator, denominator) == 1`.

## Why It Works

- Fractions between `0` and `1` require numerator smaller than denominator.
- A fraction is simplified exactly when numerator and denominator are coprime.
- Enumerating all valid numerator/denominator pairs covers every possible simplified fraction under the denominator limit.

## Edge Cases

- `n = 1` returns an empty list because no denominator can produce a valid exclusive fraction.
- Fractions like `2/4` are skipped because their gcd is greater than `1`.
- Output order is acceptable because the problem allows any order.

## Complexity

- Time: `O(n^2 log n)` due to gcd checks.
- Space: `O(1)` excluding the returned list.
