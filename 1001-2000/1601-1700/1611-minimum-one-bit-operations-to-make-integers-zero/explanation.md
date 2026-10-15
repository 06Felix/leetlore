# Minimum One Bit Operations to Make Integers Zero

## Idea

- XOR n into an accumulator, shift n right by one, and repeat until it becomes zero.

## Why It Works

- The permitted bit flips trace reflected Gray-code order from zero. The distance of a Gray-code value from zero is its decoded binary index; decoding XORs all right-shifted prefixes, which is exactly the loop’s accumulator.

## Edge Cases

- n = 0 performs no iterations and returns zero. Powers of two require 2^(b + 1) - 1 operations for bit position b.

## Complexity

- O(log(n + 1)) time and O(1) auxiliary space.

## Notes

- The nonnegative input bound makes the signed right shift safe. The result fits int under n <= 10^9.
