# Nth Digit

## Idea

- Group numbers by digit length: 1-digit, 2-digit, and so on.
- Subtract whole groups until `n` lands inside one digit-size group.
- Compute the target number within that group.
- Convert it to a string and return the target digit.

## Why It Works

- There are `9 * 10^(d - 1)` numbers with digit length `d`.
- Each such group contributes `d * count` digits to the sequence.
- After subtracting previous groups, `(n - 1) / digitSize` identifies the target number offset.
- `(n - 1) % digitSize` identifies the digit inside that number.

## Edge Cases

- Small `n <= 9` stays in the one-digit group.
- `long count` avoids overflow in group-size multiplication.
- Boundary positions at the end of a group work through zero-based `(n - 1)` math.

## Complexity

- Time: $O(\log n)$.
- Space: $O(\log n)$ for the target number string.
