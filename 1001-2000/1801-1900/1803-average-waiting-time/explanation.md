# Average Waiting Time

## Idea

- Track `curr`, the time when the chef finishes the latest order.
- For each customer, the chef starts at `max(curr, arrival)`.
- Add cooking time to get the new finish time.
- Add `finish - arrival` to total waiting time and divide by customer count.

## Why It Works

- If the chef is idle before a customer arrives, service starts at arrival time.
- Otherwise, the customer waits until `curr`.
- Waiting time includes both queue time and cooking time, exactly `finish - arrival`.
- Processing customers in input order matches the restaurant rule.

## Edge Cases

- Back-to-back arrivals accumulate wait through `curr`.
- Gaps between customers reset effective start to the later arrival time.
- `double` is used for average precision.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
