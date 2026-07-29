# Explanation

## Idea

- If the input is a bare integer, parse and return it directly.
- Otherwise scan the serialized list once with a stack of open `NestedInteger` lists.
- On `[`, push a new empty list.
- On `,` or `]`, parse any number since the last delimiter and add it to the current list.
- On `]`, pop the completed list and either attach it to its parent or return it as the outer result.

## Why It Works

- The stack represents the current nesting path.
- `start` marks the beginning of the next integer token, so each number is parsed exactly when a delimiter closes it.
- A list is popped only when its closing bracket is seen, after all direct children have been added.
- Valid input guarantees the first popped outermost list is the complete answer.

## Edge Cases

- Negative numbers work because the parsed substring includes the sign.
- Empty lists do not parse a number because of the `i > start` check.
- Single integer inputs bypass the stack path.

## Complexity

- Time: `O(n)` over the serialized string, plus substring parsing cost.
- Space: `O(d)` stack depth, excluding the returned nested structure.
