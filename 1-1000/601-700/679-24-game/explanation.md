## Idea

- Choose two current values, replace them by every possible binary arithmetic result, and recurse until one value remains.

## Why It Works

- Every allowed expression has a binary expression tree. Reducing its innermost pair first produces one of the enumerated branches; both operand orders are tried for subtraction and division. Thus every allowed expression is covered.

## Edge Cases

- Division by a value close to zero is skipped. A final value within 10⁻⁶ of 24 is accepted.

## Complexity

- O(1) time and space under the fixed four-card constraint, with only three recursive reduction levels.

## Notes

- Arithmetic uses double and an epsilon comparison, matching the real-division requirement.
