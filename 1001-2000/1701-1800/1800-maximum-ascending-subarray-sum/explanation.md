## Idea
- Track the sum of the current strictly ascending run and the best sum, starting with the first value.
- Add the next value and update the best when it increases; otherwise restart the current sum at that value.

## Why It Works
- Every value is positive, so taking an entire ascending run maximizes the sum within that run.
- Each extension records the current run's sum. On a reset, the new value is at most the preceding value, already bounded by the best recorded sum, so the implementation need not update the best at that point.

## Edge Cases
- Equal values start a new run.
- A singleton returns its value; a decreasing array returns its first, largest value.

## Complexity
- O(n) time and O(1) auxiliary space.

## Notes
- The argument relies on the statement's positive-value constraint; it does not justify this implementation for arbitrary negative values.
