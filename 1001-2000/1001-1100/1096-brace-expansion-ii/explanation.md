# Brace Expansion II

## Idea

- Parse the expression using the grammar directly.
- `expr()` handles comma-separated union.
- `term()` handles concatenation of adjacent parts.
- `part()` handles either a nested brace expression or a lowercase word.
- Use `TreeSet` so duplicates are removed and the final order is sorted.

## Why It Works

- A comma means union, so `expr()` repeatedly adds each term's generated words.
- Adjacent expressions mean cartesian-product concatenation, so `term()` multiplies the current set by the next part.
- Braces create a nested expression, so `part()` recursively calls `expr()`.
- Lowercase letters form a direct word and become a singleton set.

## Edge Cases

- Nested braces work naturally through recursion.
- Duplicate words are removed by `TreeSet`.
- Concatenation before and after braces is handled by the same `term()` loop.

## Complexity

- Time depends on the number and total length of generated words.
- Space also depends on the generated output size.

## Tags

- Recursion
- Parsing
- String
- Set
