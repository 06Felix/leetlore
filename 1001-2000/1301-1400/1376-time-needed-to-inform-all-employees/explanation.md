## Idea
- Compute each employee's notification time by following their manager chain upward.
- The head's time is zero. An employee's time is their manager's notification time plus that manager's informTime; cache computed times in a map.
- Return the greatest notification time among all employees.

## Why It Works
- An employee receives the news exactly after their manager receives it and completes the stated informing delay.
- The recurrence accumulates all delays along the unique chain from the head. Since branches proceed simultaneously, the maximum arrival time is the completion time.

## Edge Cases
- A company containing only the head returns zero.
- Zero informing delays add no time. An employee's own delay affects their subordinates, not their own arrival time.

## Complexity
- O(n) expected time with hash-map memoization and O(n) auxiliary space, including the manager-chain recursion.

## Notes
- Memoization does not bound the first uncached chain's depth. A valid chain of 100,000 employees may overflow the Java stack, depending on employee index order.
