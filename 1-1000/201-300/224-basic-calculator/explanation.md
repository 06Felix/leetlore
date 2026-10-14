## Idea

- Accumulate digits into num and keep its effective sign. A stack records the sign context of each parenthesis; operators flush the current signed number and combine their local sign with the context.

## Why It Works

- Addition and subtraction let each number contribute directly to a global total once its sign includes all enclosing parentheses. The stack propagates those enclosing signs, so nested subtraction and unary minus receive the correct effective sign. The final buffered number is added after scanning.

## Edge Cases

- Spaces are ignored. Unary minus before a number or parenthesized expression uses the same sign handling.

## Complexity

- O(length) time and O(length) space for the character array and sign stack.

## Notes

- No built-in expression evaluator is used, satisfying the explicit restriction.
