# Explanation

## Idea

- The array always contains exactly three numbers.
- Try every permutation of the three numbers.
- Convert each number to binary without the `0b` prefix, concatenate those strings, and parse the result as base 2.
- Keep the largest parsed value.

## Why It Works

- There are only `3! = 6` possible orders, so brute force covers the full search space.
- For one fixed order, the binary-string concatenation exactly matches the requested operation.
- Taking the maximum across all orders gives the maximum possible number.

## Edge Cases

- Powers of two are handled because `bin(x)[2:]` keeps the required representation without leading zeros.
- Duplicate values may repeat candidates but do not change the maximum.

## Complexity

- Time: `O(1)` because the input size is fixed at three.
- Space: `O(1)` aside from short binary strings.

## Notes

- The implementation uses `itertools.permutations`; it relies on that helper being available in the Python runtime context.
