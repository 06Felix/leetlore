# Explanation

## Idea

XOR `start` and `goal`, then count the set bits.

## Why It Works

XOR has a `1` exactly where the two numbers have different bits. Each differing bit needs one flip, and matching bits need none.

So the number of set bits in `start ^ goal` is the minimum number of flips.

## Edge Cases

- Equal numbers produce xor `0` and answer `0`.
- Leading zero bits do not matter unless they differ inside the integer representation needed for `goal`.

## Complexity

Time: `O(1)`.

Space: `O(1)`.
