## Idea

- Sort events by start day and precompute the first event starting strictly after each event ends. Use rolling suffix DP arrays for taking at most one, then two through k events.

## Why It Works

- At each index, every optimal schedule either skips the event or takes its value plus the previous DP layer at the first compatible index. Scanning backward makes the skip state available; increasing the event allowance builds the answer inductively.

## Edge Cases

- Events sharing an end/start day overlap because endpoints are inclusive. Duplicate start days are handled by the upper-bound search.

## Complexity

- O(n log n + nk) time and O(n) auxiliary space.

## Notes

- Sorting changes the event order. Long DP values are cast to int safely here: k≤n and kn≤10⁶ imply k≤1000, so the answer is at most 10⁹.
