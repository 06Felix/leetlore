# Human Traffic of Stadium

## Idea

- Filter to rows with at least 100 people. Compute id minus ROW_NUMBER ordered by id to identify consecutive-ID groups. Retain all rows belonging to groups of size at least three and order by visit_date.

## Why It Works

- Within a consecutive sequence, both id and row number increase by one, so their difference stays constant. An ID gap changes that difference, splitting groups. Filtering first makes low-attendance rows break an otherwise consecutive run.

## Edge Cases

- Exactly 100 people qualifies. Consecutive IDs need not have consecutive calendar dates. Every row of a qualifying long run is returned.

## Complexity

- Typically O(S log S) time for window/output sorting and O(S) workspace for S stadium rows; physical costs depend on the plan.

## Notes

- The original query passed a SQLite fixture with date gaps and an attendance break. MySQL execution was not tested.
