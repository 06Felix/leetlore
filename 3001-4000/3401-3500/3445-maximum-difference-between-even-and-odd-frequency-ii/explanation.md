# Maximum Difference Between Even and Odd Frequency II

## Idea
- Try each ordered pair of distinct digits from zero through four, maintaining their prefix counts.
- Advance a left boundary when the current substring has length at least `k` and positive counts of both chosen digits; store the minimum prefix-count difference for each parity pair.
- At each endpoint, subtract the best eligible prefix difference with opposite first-digit parity and matching second-digit parity.

## Why It Works
- Substring counts are prefix differences. Opposite first-digit parity makes its count odd; matching second-digit parity makes its count even.
- Eligibility requires a positive second-digit count, so the even count is at least two. Length and positivity remain valid as the endpoint advances, allowing old prefixes to stay in the table.
- Minimizing the earlier prefix difference maximizes the substring's frequency difference for each pair and endpoint; all ordered pairs cover every candidate.

## Edge Cases
- Other digits may occur freely inside the substring; only the chosen pair affects its score.
- Negative valid answers are preserved. Sentinel values remain safely below real candidate scores under the given length bound.

## Complexity
- Time: $O(20n)$, with each boundary moving only forward for each ordered pair.
- Space: $O(n)$ for the two prefix-count lists; parity minima require four entries.

## Notes
- The implementation uses `Pair`, which must be provided by the judge environment or an appropriate class/import for standalone compilation.
