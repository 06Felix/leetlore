# Valid Number

## Idea

- The solution scans the string once while tracking whether it has seen a digit, dot, or exponent.
- A dot is allowed only before any dot or exponent.
- An exponent is allowed only once and only after at least one digit.
- A sign is allowed only at the start or immediately after `e`/`E`.

## Why It Works

- These flags encode the grammar constraints for decimal and integer forms.
- Resetting `seenNum` after an exponent forces digits to appear in the exponent part.
- Invalid letters or misplaced symbols return `false` immediately.
- At the end, `seenNum` confirms the final component contains at least one digit.

## Edge Cases

- `"."`, `"e"`, and sign-only strings return `false`.
- Values like `"4."` and `"-.9"` are accepted because they contain digits in a valid decimal form.
- Both lowercase `e` and uppercase `E` are handled.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
