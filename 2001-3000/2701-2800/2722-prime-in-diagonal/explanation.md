# Prime In Diagonal

## Idea

- Scan the main diagonal and anti-diagonal.
- Test each diagonal value for primality.
- Track the largest prime found.

## Why It Works

- The problem only considers values at `(i, i)` and `(i, n - i - 1)`.
- Checking both diagonals visits all candidate cells.
- The primality helper rejects values `<= 1`, even numbers greater than `2`, and odd composite numbers by trial division.

## Edge Cases

- If no diagonal value is prime, `ans` stays `0`.
- The center of an odd-sized matrix may be checked twice, which does not affect the maximum.
- Value `2` is handled as prime before the even-number rejection.

## Complexity

- Time: `O(n * sqrt(V))`, where `V` is the largest diagonal value.
- Space: `O(1)`.
