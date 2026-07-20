# Fix Names in a Table

## Idea

- Select each `user_id` and rebuild `name` from two parts.
- `SUBSTRING(name, 1, 1)` extracts the first character and `UPPER` capitalizes it.
- `SUBSTRING(name, 2)` extracts the remaining suffix and `LOWER` normalizes it.
- `CONCAT` joins those pieces, then the query orders rows by `user_id`.

## Why It Works

- The desired output keeps exactly the same characters, only changing letter case.
- The first-character expression handles the only position that must be uppercase.
- The suffix expression handles every remaining position that must be lowercase.
- Ordering by column `1` orders by the selected `user_id`.

## Edge Cases

- Already normalized names remain unchanged.
- Mixed-case names are fixed because both parts are explicitly case-converted.
- Single-character names produce an empty suffix, so the result is just the uppercase first letter.

## Complexity

- Time: $O(n \cdot L)$ for `n` names with average length `L`.
- Space: $O(n \cdot L)$ for the returned formatted strings.
