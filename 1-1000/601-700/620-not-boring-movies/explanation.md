# Not Boring Movies

## Idea

- Filter Cinema for odd IDs and descriptions unequal to boring, then return every column ordered by rating descending.

## Why It Works

- Both WHERE predicates must hold for a row to survive. ORDER BY then places the selected rows in exactly the required descending rating order.

## Edge Cases

- Even IDs and boring descriptions are excluded. No secondary ordering is specified for equal ratings.

## Complexity

- With a scan and explicit sort, O(C + R log R) time and up to O(R) sort workspace for C rows and R retained rows; the actual plan may use indexes.

## Notes

- SQL comparisons to NULL evaluate as unknown, so a NULL description would be excluded. Fixture semantics were checked with SQLite; MySQL execution and collation behavior were not tested.
