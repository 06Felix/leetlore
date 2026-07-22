# Explanation

Problem: [Find if Digit Game Can Be Won](https://leetcode.com/problems/find-if-digit-game-can-be-won/)

## Idea

- Sum all single-digit numbers into `sd`.
- Sum all double-digit numbers into `dd`.
- Compute Bob's score for each choice as total minus Alice's chosen sum.
- Alice wins if either choice gives her a strictly larger sum.

## Why It Works

- Alice has only two possible strategies: take all single-digit numbers or take all double-digit numbers.
- If she takes singles, Bob gets exactly `total - sd`.
- If she takes doubles, Bob gets exactly `total - dd`.
- Checking both strict inequalities therefore covers all possible winning choices.

## Edge Cases

- If both choices tie or lose, the method returns false.
- Arrays containing only one digit group are handled because the other group sum is `0`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- This is a Python solution; the explanation matches the imported `solution.py`.
