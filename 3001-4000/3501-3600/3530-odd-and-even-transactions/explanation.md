# Odd and Even Transactions

## Idea

- Group transactions by `transaction_date`.
- Use conditional aggregation for odd amounts.
- Use another conditional aggregation for even amounts.
- Order the grouped result by date.

## Why It Works

- `amount % 2 = 1` identifies odd transaction amounts.
- `amount % 2 = 0` identifies even transaction amounts.
- Each `CASE` contributes the amount to the matching bucket and `0` otherwise.
- `SUM` over the group gives the per-date totals with missing buckets naturally becoming `0`.

## Edge Cases

- A date with only odd transactions gets `even_sum = 0`.
- A date with only even transactions gets `odd_sum = 0`.
- Multiple transactions on one date are aggregated together.

## Complexity

- Time: database-dependent, typically $O(n \log n)$ for grouping and ordering.
- Space: $O(d)$ for `d` grouped dates.
