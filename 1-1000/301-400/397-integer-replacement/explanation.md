# Explanation

## Idea

Repeatedly reduce `n` toward `1`. Even numbers are divided by two. Odd numbers usually choose the direction that creates a multiple of four, because that allows more divisions by two afterward.

The special case `n == 3` decrements to `2`.

## Why It Works

For even `n`, division by two is forced.

For odd `n`, either `n - 1` or `n + 1` becomes even. If the second-lowest bit is `0`, decrementing makes the result divisible by more powers of two; otherwise incrementing usually does. The value `3` is the exception because `3 -> 2 -> 1` is shorter than `3 -> 4 -> 2 -> 1`.

Using `long` avoids overflow when incrementing `Integer.MAX_VALUE`.

## Edge Cases

- `n = 1` returns `0`.
- `n = 3` uses the special decrement path.
- `2^31 - 1` can be incremented safely as a `long`.

## Complexity

Time: `O(log n)`.

Space: `O(1)`.
