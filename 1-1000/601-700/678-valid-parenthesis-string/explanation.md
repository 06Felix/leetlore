# Explanation

## Idea

- Track a range of possible unmatched open-parenthesis counts.
- `low` is the minimum possible open count; `high` is the maximum possible open count.
- Interpret `'*'` flexibly to widen or shrink that range.

## Why It Works

- `'('` must increase both bounds.
- `')'` must decrease both bounds, with `low` clamped at `0` because opens cannot be negative.
- `'*'` may act as `')'`, `'('`, or empty, so it decreases the minimum and increases the maximum.
- If `high` becomes negative, too many right parentheses have appeared; if final `low` is `0`, some assignment balances the string.

## Edge Cases

- All `'*'` can be treated as empty.
- Early unmatched `')'` fails when `high < 0`.
- Strings already balanced without stars pass.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
