# Fizz Buzz

## Idea

- The solution iterates from `1` through `n`.
- It checks divisibility by `15` first for numbers divisible by both `3` and `5`.
- Then it checks divisibility by `5`, then by `3`.
- Numbers matching none of those cases are converted to strings.

## Why It Works

- Divisibility by both `3` and `5` is equivalent to divisibility by `15`.
- Checking `15` first prevents those numbers from being classified as only `"Fizz"` or `"Buzz"`.
- Each integer has exactly one output rule, and the loop appends outputs in order.

## Edge Cases

- `n = 1` returns just `"1"`.
- Multiples of `15` return `"FizzBuzz"`.
- Nonmultiples are preserved as decimal strings.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the returned list.
