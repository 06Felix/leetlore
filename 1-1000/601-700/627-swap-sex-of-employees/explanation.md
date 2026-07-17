# Explanation

## Idea

- Use one `UPDATE` statement over the `Salary` table.
- Set `sex` with `IF(sex = 'm', 'f', 'm')`.

## Why It Works

- The column contains only `'m'` and `'f'`.
- If the old value is `'m'`, the expression writes `'f'`.
- Otherwise the old value must be `'f'`, so the expression writes `'m'`.

## Edge Cases

- All rows are updated in place.
- No temporary table is needed.
- The solution relies on the problem's enum restriction to avoid other values.

## Complexity

- Time: $O(n)$ logical row updates.
- Space: $O(1)$ extra at query level.
