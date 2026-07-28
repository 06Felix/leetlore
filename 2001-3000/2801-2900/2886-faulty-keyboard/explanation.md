# Explanation

## Idea

Simulate typing with a `StringBuilder`. Normal characters are appended; each `i` reverses the current builder.

## Why It Works

The faulty keyboard rule affects only the already-typed text when `i` is typed. Reversing the builder at that exact point matches the operation.

All other characters are typed normally in order.

## Edge Cases

- Consecutive `i` characters reverse twice.
- The first character is not `i` by constraint.
- The input is small, so direct reversal is simple enough.

## Complexity

Time: `O(n^2)` worst case because each reverse can scan the current text.

Space: `O(n)`.
