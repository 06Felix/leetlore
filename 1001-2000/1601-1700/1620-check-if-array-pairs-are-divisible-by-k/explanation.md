# Check If Array Pairs Are Divisible by k

## Idea

- Count every number by its normalized remainder modulo `k`.
- Remainder `0` values must pair among themselves.
- For every remainder `i`, its count must match the count of remainder `k - i`.

## Why It Works

- Two numbers sum to a multiple of `k` exactly when their remainders sum to `0` modulo `k`.
- Normalizing `(x % k + k) % k` handles negative numbers correctly.
- Remainder classes can be paired independently, so matching complementary counts is sufficient.

## Edge Cases

- Remainder `0` needs an even count.
- When `k` is even, remainder `k / 2` also needs an even count; the equality check with itself enforces no mismatch but the total even array length plus pairing constraints cover valid cases in accepted inputs.
- Negative values are normalized before counting.

## Complexity

- Time: `O(n + k)`.
- Space: `O(k)`.
