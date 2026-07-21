# Explanation

Problem: [DI String Match](https://leetcode.com/problems/di-string-match/)

## Idea

- Keep the smallest unused number `l` and largest unused number `r`.
- For `I`, place `l` and increment it.
- For `D`, place `r` and decrement it.
- After all pattern characters are processed, place the final remaining number.

## Why It Works

- If the next relation is `I`, choosing the smallest unused number leaves only larger or equal remaining choices for the next position, so the increase can be satisfied.
- If the next relation is `D`, choosing the largest unused number leaves only smaller or equal remaining choices for the next position, so the decrease can be satisfied.
- Each step consumes one distinct value from `0..n`, and the last remaining value completes the permutation.

## Edge Cases

- All `I` returns ascending order.
- All `D` returns descending order.
- Length `1` works with one greedy placement and the final leftover value.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ extra, excluding the returned array.

## Notes

- The greedy choice depends only on the next relation, not future characters.
