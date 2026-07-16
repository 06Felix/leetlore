# Basic Calculator II

## Idea

- The implementation scans the expression once, building the current number digit by digit.
- `prevOperation` stores the operator that should be applied to the current number when the next operator is reached.
- Addition and subtraction push signed numbers onto a stack.
- Multiplication and division immediately combine the current number with the previous stack value to enforce precedence.

## Why It Works

- `*` and `/` have higher precedence, so evaluating them before pushing the next low-precedence term is correct.
- `+` and `-` can be delayed by storing signed terms and summing them at the end.
- Spaces are ignored, and the final number is processed after the loop using the last pending operator.
- Java integer division truncates toward zero, matching the problem requirement.

## Edge Cases

- Multi-digit numbers are handled by `curNum = curNum * 10 + digit`.
- Expressions with leading or internal spaces are skipped cleanly.
- A final multiplication or division is handled after the scan ends.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the stack in the worst case.
