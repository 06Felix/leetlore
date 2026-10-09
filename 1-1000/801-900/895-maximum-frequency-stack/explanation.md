## Idea
- Track each value's current frequency and keep a deque for each frequency level.
- A push records the value in the deque for its new frequency. A pop removes the newest entry at the current maximum frequency, then decreases that value's frequency and possibly the maximum.

## Why It Works
- The maximum-frequency deque selects exactly the most frequent remaining values; its stack order breaks ties by the latest push.
- Lower-frequency entries remain as history. Once a value loses its highest-frequency occurrence, its earlier entry supplies the correct lower-level recency.

## Edge Cases
- Distinct values all use frequency one and pop in stack order.
- Emptying the maximum deque reduces the maximum by one. The statement guarantees pop is never called on an empty structure.

## Complexity
- push and pop are O(1) expected amortized time with hash maps and dynamic containers.
- O(P) allocated space after P pushes, including historical frequency entries and retained containers.

## Notes
- When the maximum rises again after a pop, push appends a new deque even when that level already has a reusable empty deque at its index. The appended deque can remain unused; indexing remains correct, but storage tracks cumulative pushes rather than just current stack size.
