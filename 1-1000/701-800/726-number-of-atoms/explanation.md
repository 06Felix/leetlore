# Number of Atoms

## Idea

- Parse the formula recursively with a shared index `i`.
- Each parse scope stores atom counts in a `TreeMap`.
- On `(`, recursively parse the nested group and merge its counts.
- On `)`, read the following multiplier, multiply the current scope, and return it.

## Why It Works

- Parentheses create nested scopes whose contents are multiplied as a unit.
- Atom names and optional counts are read according to the formula grammar.
- `TreeMap` keeps atom names sorted for final output.
- Recursive returns merge completed group counts into the enclosing scope.

## Edge Cases

- Missing numeric count defaults to `1`.
- Multi-letter atom names are read as uppercase followed by lowercase letters.
- Nested groups multiply inner counts before returning outward.

## Complexity

- Time: $O(L \log A)$ for formula length `L` and distinct atoms `A`.
- Space: $O(A + D)` for maps and recursion depth `D`.
