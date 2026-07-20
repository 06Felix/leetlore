# Delete Duplicate Emails

## Idea

- Self-join `Person` as `P1` and `P2` on equal email addresses.
- Delete the `P2` row whenever another row `P1` has the same email and a smaller `id`.
- This leaves only the lowest-id row for each email.

## Why It Works

- For every duplicate group, each non-minimum row has at least one same-email row with smaller `id`.
- The minimum-id row has no smaller same-email row, so it is never selected as `P2`.
- Deleting all selected `P2` rows removes duplicates in one statement.

## Edge Cases

- Unique emails have no matching smaller-id row and are kept.
- Groups with more than two duplicates delete every row except the smallest `id`.
- Final row order is irrelevant for this problem.

## Complexity

- Time: typically $O(n^2)$ without an index on `email`; database indexes can improve the join.
- Space: handled by the database execution plan.
