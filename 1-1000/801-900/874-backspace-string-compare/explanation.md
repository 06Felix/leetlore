# Backspace String Compare

## Idea

- Simulate typing each string with a stack.
- Push normal characters.
- On `#`, pop one character if the stack is not empty.
- Compare the two resulting stacks.

## Why It Works

- A stack models an editor where backspace removes the most recently kept character.
- Ignoring `#` when the stack is empty matches the problem's empty-editor behavior.
- If the final stacks have the same characters in the same order, the typed results are equal.

## Edge Cases

- Extra backspaces at the beginning have no effect.
- Strings that reduce to empty compare equal when both stacks are empty.
- Different final lengths return `false` immediately.

## Complexity

- Time: `O(n + m)`.
- Space: `O(n + m)` for the two stacks.
