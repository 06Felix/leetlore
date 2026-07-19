# Explanation

Problem: [Minimum Number of Operations to Make Array XOR Equal to K](https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/)

## Idea

Compute the current XOR of the whole array. The bits that differ from `k` are exactly the bits that must be toggled an odd number of times, so the answer is the number of set bits in `currentXor ^ k`.

## Why It Works

Flipping one bit in any one array element flips that same bit in the total XOR. Bits are independent under XOR, so a bit already matching `k` needs no operation, while a mismatching bit needs one flip somewhere in the array. Extra flips would only add pairs of redundant changes. Therefore the minimum number of operations equals the number of differing bit positions, which `Integer.bitCount(tx ^ k)` computes.

## Edge Cases

- If the current XOR is already `k`, `tx ^ k` is `0` and the answer is `0`.
- Leading zero bits are allowed, so any differing bit can be fixed with one flip.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
