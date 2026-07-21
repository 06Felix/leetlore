# Explanation

Problem: [Water and Jug Problem](https://leetcode.com/problems/water-and-jug-problem/)

## Idea

- Use Bezout's identity for the two jug capacities.
- A target amount is measurable iff it is `0`, or it does not exceed `x + y` and is divisible by `gcd(x, y)`.
- Compute the gcd with the recursive Euclidean algorithm.

## Why It Works

- Pouring, filling, and emptying jugs can create exactly integer combinations of the two capacities.
- The set of reachable measured amounts is therefore restricted to multiples of `gcd(x, y)`.
- Bezout's identity also guarantees every multiple of `gcd(x, y)` up to total capacity can be measured.
- The capacity check rules out targets larger than both jugs can hold together.

## Edge Cases

- Target `0` is always possible.
- If one capacity is `0`, the gcd logic still handles the non-zero jug.

## Complexity

- Time: $O(\log \min(x, y))$.
- Space: $O(\log \min(x, y))$ recursion depth.

## Notes

- No simulation is needed; the number theory condition fully characterizes reachability.
