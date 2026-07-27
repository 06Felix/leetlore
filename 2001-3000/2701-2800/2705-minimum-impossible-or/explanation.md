# Explanation

## Idea

Store all numbers in a set, then test powers of two starting from `1`.

The first missing power of two is returned.

## Why It Works

A positive power of two has exactly one bit set. The only way to create that exact OR is to choose a number that has no other set bits, which means that same power of two must exist in the array.

If every smaller power of two exists, all smaller positive values can be formed by OR-ing the needed single-bit values. Therefore the first missing power of two is the minimum impossible value.

## Edge Cases

- If `1` is missing, answer is immediately `1`.
- Non-power-of-two values do not help form a missing single-bit value.
- Values up to `10^9` fit safely while shifting `ans` through relevant powers.

## Complexity

Time: `O(n + log V)`.

Space: `O(n)`.
