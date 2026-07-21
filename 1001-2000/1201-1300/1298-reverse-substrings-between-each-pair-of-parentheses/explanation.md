# Reverse Substrings Between Each Pair of Parentheses

## Idea

- First pair every opening parenthesis with its matching closing parenthesis using a stack.
- Then scan the string with an index `i` and direction `d`.
- When a parenthesis is hit, jump to its pair and reverse direction.
- Append only letters to the output.

## Why It Works

- Reversing a parenthesized substring is equivalent to walking that region in the opposite direction.
- Jumping between matched parentheses enters or exits a reversed region.
- Flipping `d` on each jump correctly handles nested parentheses.
- Since parentheses are skipped and only letters are appended, the final output has no brackets.

## Edge Cases

- Balanced parentheses are guaranteed.
- Nested pairs work because each boundary flips direction.
- Strings without effective reversals append letters in normal order.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for pair mappings and output.
