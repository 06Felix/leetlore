# Movie Rating

## Idea

- Use two independently ordered queries. The first groups all ratings by user and picks the largest rating count, breaking ties by name. The second filters February 2020, groups by movie, and picks the largest average, breaking ties by title. Combine their one-row results with UNION ALL.

## Why It Works

- Each branch ranks exactly the candidates for its own question. Secondary ascending text order implements the lexicographic tie-break, and LIMIT 1 selects its winner. UNION ALL preserves both output rows even if the winning name and title are identical.

## Edge Cases

- The user count uses all dates, while the movie average uses February only. Duplicate result strings must not be deduplicated.

## Complexity

- Plan-dependent: roughly O(R + U log U + M log M) aggregation/sort work with suitable joins, and O(U + M) grouping storage for R ratings, U users, and M movies.

## Notes

- DATE_FORMAT and parenthesized limited UNION branches follow the submitted MySQL syntax. No outer ORDER BY guarantees branch output order in general SQL. The statement’s sample expects user then movie; this is the existing implementation, reviewed but not executed on MySQL.
