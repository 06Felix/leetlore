# Expression Add Operators

## Idea

- Backtrack over every possible next operand substring.
- Track `eval`, the current expression value, and `prev`, the last signed operand contribution.
- For `+` and `-`, add or subtract the current operand directly.
- For `*`, replace the previous contribution with `prev * curr` to respect multiplication precedence.

## Why It Works

- Every valid expression is formed by choosing operand cuts and an operator before each operand after the first.
- The recursion enumerates all such choices.
- `eval - prev + prev * curr` correctly re-evaluates the last term for multiplication.
- Rejecting multi-digit operands beginning with `0` enforces the no-leading-zero rule.

## Edge Cases

- The first operand is added without a leading operator.
- Targets outside `int` expression intermediates are handled with `long` during evaluation.
- If no expression matches, the answer list stays empty.

## Complexity

- Time: $O(4^n)$ in the worst case from operand cuts and operator choices.
- Space: $O(n)$ recursion/string-builder depth, excluding output.
