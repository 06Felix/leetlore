# Explanation

## Idea

Use rejection sampling. Two calls to `rand7()` generate a uniform number from `0` to `48`.

Values `0` through `39` are accepted and mapped to `1` through `10`; values `40` through `48` are retried.

## Why It Works

The pair of `rand7()` calls has `49` equally likely outcomes. Accepting exactly `40` outcomes gives a count divisible by `10`.

Taking `n % 10 + 1` maps those `40` accepted outcomes evenly onto the ten output values, so each result has probability `1 / 10`.

Rejected outcomes are discarded and sampled again, preserving uniformity.

## Edge Cases

- The loop may retry, but it terminates with probability `1`.
- No built-in random API is used; only `rand7()` is called.

## Complexity

Expected time: `O(1)`.

Space: `O(1)`.
