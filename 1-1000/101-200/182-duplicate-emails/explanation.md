# Explanation

## Idea

- Group rows in `Person` by their `email` value.
- Keep only groups whose row count is greater than one.
- Return the grouped email under the required `Email` column alias.

## Why It Works

- A group contains exactly the rows sharing one email address.
- `having count(1) > 1` removes every group that occurs once and retains every duplicate email.

## Edge Cases

- An email appearing exactly twice is included.
- An email appearing once is excluded.
- The query returns no rows when there are no duplicates.

## Complexity

- Time and space depend on the database's grouping plan and available index on `email`.

## Notes

- This is the SQL implementation imported from the submission; its behavior is database-engine dependent only in execution strategy, not in the grouping result.
