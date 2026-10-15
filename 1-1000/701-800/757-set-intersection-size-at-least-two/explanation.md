# Set Intersection Size At Least Two

## Idea

- Sort intervals by increasing right endpoint, breaking ties by decreasing left endpoint. Track the two largest selected points. Add nothing if both lie in the current interval, its right endpoint if only one does, or its two rightmost integers if neither does.

## Why It Works

- Earlier selected points cannot exceed the current right endpoint. The two largest therefore determine whether zero, one, or two usable points already exist. Adding missing points as far right as possible satisfies the current interval and maximizes usefulness to later intervals; an exchange with any smaller feasible choices cannot hurt coverage.

## Edge Cases

- Each interval has at least two integers. The tie order handles tighter equal-end intervals first, avoiding duplicate additions of an already selected endpoint.

## Complexity

- O(n log n) time and O(n) auxiliary space for object-array sorting; the scan uses O(1) extra space.

## Notes

- Sorting reorders intervals. The code stores only the two latest selected points and the total size, not the full containing set.
