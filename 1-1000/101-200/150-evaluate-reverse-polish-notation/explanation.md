# Evaluate Reverse Polish Notation

## Idea

- Use an ArrayDeque as a stack with its last end as the top. Push integer tokens; for each operator, pop its operands, evaluate, and append the result. Return the single remaining value.

## Why It Works

- In postfix notation, an operator’s operand expressions have already been evaluated and occupy the two top stack positions. Replacing them with their result preserves the stack of completed expressions. The first popped value is the right operand, handled explicitly for division and by negation for subtraction.

## Edge Cases

- Negative integer tokens go through parsing rather than the operator cases. Java integer division truncates toward zero as required.

## Complexity

- O(t) time and O(t) worst-case auxiliary space for t tokens under the bounded token lengths.

## Notes

- Input validity, nonzero divisors, and int-safe intermediate calculations are guaranteed. The final poll reads from the opposite end, but exactly one value remains.
