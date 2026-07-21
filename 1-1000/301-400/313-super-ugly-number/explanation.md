# Super Ugly Number

## Idea

- Store generated ugly numbers in `nums`, starting with `1`.
- For each prime, keep a heap entry containing the prime, an index into `nums`, and the next product value.
- Repeatedly take the smallest heap value as the next ugly number.
- Advance every heap entry with the same value to avoid duplicates.

## Why It Works

- Every super ugly number after `1` is some prime times an earlier super ugly number.
- The heap keeps the smallest next candidate for each prime.
- Taking the global minimum generates numbers in increasing order.
- Advancing all equal candidates prevents emitting the same value multiple times.

## Edge Cases

- `n = 1` returns `1`.
- Different primes can produce the same candidate, such as `2 * 7` and `7 * 2`.
- Primes are already unique and sorted, but heap ordering handles candidate order.

## Complexity

- Time: $O(n p \log p)$ in duplicate-heavy cases, usually $O(n \log p)$ for `p = primes.length`.
- Space: $O(n + p)`.

## Notes

- Candidate multiplication is stored in `int`; although the requested answer fits in 32 bits, intermediate products can be safer as `long`.
