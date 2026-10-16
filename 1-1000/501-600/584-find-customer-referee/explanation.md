# Find Customer Referee

## Idea

- Return customer names where IFNULL(referee_id, -1) is not two.

## Why It Works

- A non-NULL referee ID passes exactly when it differs from two. A NULL referee is replaced with -1, which also passes, preserving customers with no referee instead of losing them to SQL three-valued comparisons.

## Edge Cases

- Customers referred by two are excluded. Names are not deduplicated because the query returns one row per qualifying customer.

## Complexity

- O(C) predicate-evaluation work for a full scan of C customers, with output-dependent storage; physical execution depends on the database plan.

## Notes

- IFNULL is part of the actual submitted SQL. The -1 replacement is only used for comparison and is never written to data. Fixture semantics were checked with SQLite; MySQL execution was not tested.
