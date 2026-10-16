# Combine Two Tables

## Idea

- Select the required name and address columns from Person LEFT JOIN Address USING (personId).

## Why It Works

- The join matches addresses by the shared person ID. LEFT JOIN preserves every person even without a match, supplying SQL NULL for missing address fields.

## Edge Cases

- Addresses without a matching person are excluded. Multiple matching addresses generate multiple result rows, as ordinary join semantics require.

## Complexity

- Plan-dependent: a suitable Address(personId) index supports roughly O(P log A + J) work, while an unindexed nested loop may require O(P * A + J), for P people, A addresses, and J output rows.

## Notes

- The query is the existing SQL implementation. Result order is unspecified, as permitted. Fixture semantics were checked with SQLite; MySQL execution was not tested.
