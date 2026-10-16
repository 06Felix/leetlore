# Trips and Users

## Idea

- Join Trips separately to its client and driver. Keep only trips where both users are unbanned and the request date is between October 1 and October 3, 2013. Group by date and divide cancelled-trip count by total count, rounded to two decimals.

## Why It Works

- The two joins and banned filters remove ineligible requests from both numerator and denominator. Under the stated status enum, every non-completed status is a cancellation, so summing that predicate counts exactly cancelled eligible trips.

## Edge Cases

- A day with eligible trips but no cancellations reports zero. Days with no eligible trips produce no group and avoid division by zero. Both date endpoints are included.

## Complexity

- Plan-dependent: roughly O(T + U) expected join/grouping time with hash joins, or O(T log U) indexed lookup work, for T trips and U users; group storage depends on the retained dates.

## Notes

- The query relies on MySQL numeric predicate sums and non-integer division with /. SQLite integer-division behavior differs, so its execution would not establish MySQL numeric correctness. The submitted query was reviewed but not run on MySQL.
