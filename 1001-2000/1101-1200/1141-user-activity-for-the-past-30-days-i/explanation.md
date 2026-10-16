# User Activity for the Past 30 Days I

## Idea

- Filter activity_date inclusively from 2019-06-28 through 2019-07-27. Group by date and count distinct user IDs.

## Why It Works

- The inclusive endpoints cover exactly the requested thirty days. DISTINCT collapses repeated activities and sessions for the same user on a date, leaving precisely the daily active-user count.

## Edge Cases

- Both boundary dates are included. Dates without activity are absent, as requested. Duplicate source rows do not inflate the count.

## Complexity

- Plan-dependent: roughly O(A) expected time and O(D) distinct-group storage for A scanned activities and D retained day-user pairs; sorting may add O(A log A) work.

## Notes

- Any activity type qualifies, so no activity_type filter is needed. The original query passed a SQLite fixture covering dates and duplicate activity; MySQL was not executed.
