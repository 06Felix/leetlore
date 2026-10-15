# Two Best Non-Overlapping Events

## Idea

- Sort events by start time and build suffix maximum values. For each possible first event, binary-search the first later event whose start is strictly beyond its end; combine with that suffix maximum. Also consider the first event alone.

## Why It Works

- All compatible later events form a suffix of the start-sorted array, whose best value is precomputed. Every feasible two-event choice has an earlier event examined by the scan; maximizing over these combinations and singles gives the optimum.

## Edge Cases

- Equal end/start timestamps overlap and are excluded by the strict comparison. Taking only one event is allowed.

## Complexity

- O(n log n) time and O(n) auxiliary space for sorting and suffix maxima.

## Notes

- Sorting reorders events. Event values sum to at most 2000000, safely within int range.
