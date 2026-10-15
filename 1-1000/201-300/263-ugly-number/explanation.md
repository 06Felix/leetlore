# Ugly Number

## Idea

- Repeatedly divide by an available factor of 2, 5, or 3 while n > 1. Stop if none divides it, then test whether n equals one.

## Why It Works

- Removing these factors never introduces a forbidden prime. Reaching one means every prime factor was allowed; a remaining value greater than one has a forbidden prime divisor.

## Edge Cases

- One is ugly even without any prime factors. Zero and negative inputs fail without entering the loop.

## Complexity

- O(log n) time for positive n and O(1) auxiliary space.

## Notes

- The input is reduced only in the local parameter; no factorization array is needed.
