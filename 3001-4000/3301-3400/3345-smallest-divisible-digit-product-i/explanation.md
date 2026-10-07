# Explanation

## Idea
- Test integers in ascending order starting at `n`.
- Multiply each candidate's decimal digits and return the first product divisible by `t`.

## Why It Works
- Ascending enumeration makes the first passing candidate the smallest permitted answer.
- Repeated remainder and division by ten extract every decimal digit exactly once.
- A number containing zero has digit product zero, which is divisible by every allowed positive `t`, guaranteeing termination.

## Edge Cases
- If `n` already satisfies the condition, return it immediately.
- For `t = 1`, every product qualifies; a multiple of ten qualifies regardless of `t`.

## Complexity
- Time: $O(d)$ under these constraints, with at most ten candidates before reaching a multiple of ten, each having at most `d` digits.
- Auxiliary space: $O(1)$.
