# Consecutive Numbers

## Idea

- Join three copies of Logs on successive IDs, require all three num values to match, and select distinct matching values.

## Why It Works

- Every matching join triple represents three equal values at IDs i, i + 1, and i + 2. Any longer consecutive run contains such a triple, and DISTINCT removes repeated detections of the same value.

## Edge Cases

- Runs longer than three still return one value. ID gaps cannot form a match even if neighboring returned rows have equal values.

## Complexity

- Plan-dependent: indexed ID lookups can take roughly O(L log L) work for L logs plus deduplication; unoptimized joins can be much more expensive.

## Notes

- Consecutiveness is implemented as adjacent numeric IDs, following the submitted query. The original query passed a SQLite fixture; MySQL was not executed.
