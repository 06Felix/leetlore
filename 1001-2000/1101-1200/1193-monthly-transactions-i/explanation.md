# Monthly Transactions I

## Idea

- Group transactions by DATE_FORMAT(trans_date, year-month) and country. Count all rows and sum all amounts, then use approval predicates to count approved rows and conditionally sum their amounts.

## Why It Works

- Month and country define exactly the required buckets. MySQL evaluates approved comparisons as numeric zero or one, and IF contributes an amount only for approved transactions, so each aggregate matches its requested metric.

## Edge Cases

- A bucket containing only declined transactions has zero approved count and amount. Different years with the same month number remain separate; NULL countries form their own group.

## Complexity

- Plan-dependent: roughly O(T) expected aggregation time and O(G) group workspace for T transactions and G month-country groups; a sort-based plan may take O(T log T).

## Notes

- This is MySQL-specific SQL using DATE_FORMAT, boolean aggregation, and IF. It was reviewed from the statement and implementation, but not executed on MySQL.
