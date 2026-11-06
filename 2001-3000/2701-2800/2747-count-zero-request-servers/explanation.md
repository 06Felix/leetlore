# 2747. Count Zero Request Servers

## Idea

- Sort the logs by time and process the queries in increasing time order.
- Keep a sliding window containing exactly the logs whose times are in `[query - x, query]`.
- Track how many requests each server has inside that window, plus how many servers are currently active.

## Why It Works

- Before answering a query, add every log at or before its time.
- Remove only logs strictly before `query - x`; a request at `query - x` is still inside the inclusive interval.
- A server has no request in the interval exactly when it is not active, so the answer is `n - active`.

## Edge Cases

- Multiple requests from the same server are counted with `freq`, so removing one request does not incorrectly mark it inactive.
- Queries may be unsorted; sorting their positions temporarily lets the window move only forward.

## Complexity

- Time: $O((L + Q) \log(L + Q))$, where $L$ is the number of logs and $Q$ is the number of queries.
- Space: $O(n + Q)$.

## Tags

- Array
- Sorting
- Sliding Window
