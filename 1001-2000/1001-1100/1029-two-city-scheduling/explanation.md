## Idea
- Sort people by A-cost minus B-cost.
- Send the first half to A and the last half to B, accumulating the two ends of the sorted array together.

## Why It Works
- Starting from the cost of sending everyone to B, choosing a person for A changes the total by A-cost minus B-cost.
- Exactly half must switch to A, so choosing the smallest differences minimizes the total.

## Edge Cases
- Equal differences can be ordered arbitrarily.
- The even-length guarantee makes paired accumulation assign exactly half to each city.

## Complexity
- O(N log N) time for N people.
- O(N) worst-case auxiliary space for sorting the array of row references; accumulation uses O(1) space.

## Notes
- Sorting changes the order of rows in costs. The comparator arithmetic fits int under the stated cost bounds.
