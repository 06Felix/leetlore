# Explanation

## Idea

- Build a new string with `StringBuilder`.
- Copy every character except `'.'`.
- Replace each period with `"[.]"`.

## Why It Works

- Defanging changes only periods.
- Every non-period character from the valid IPv4 address should stay in the same order.
- Appending `"[.]"` at each period position produces the required escaped address.

## Edge Cases

- Addresses with three periods get exactly three replacements.
- Numeric characters are copied unchanged.
- The input is guaranteed to be a valid IPv4 address.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the output builder.
