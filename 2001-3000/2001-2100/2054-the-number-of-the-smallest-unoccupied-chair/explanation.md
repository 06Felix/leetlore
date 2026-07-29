# Explanation

## Idea

- Attach each friend's index to its arrival and leaving time.
- Sort friends by arrival time.
- Keep `cur`, a min-heap of occupied chairs ordered by leaving time.
- Keep `avail`, a min-heap of free chair numbers.
- Before each arrival, release every chair whose leaving time is at or before the arrival time.
- The target friend gets the smallest free chair if one exists, otherwise the next new chair.

## Why It Works

- Sorting by arrival simulates the party in chronological order.
- Chairs with leaving time `<= arrival` are free at the exact arrival moment, matching the statement.
- A min-heap of free chair numbers always exposes the smallest unoccupied chair.
- Since the target chair is determined before seating later friends, returning immediately at target arrival is correct.

## Edge Cases

- Simultaneous leave and arrival is handled by the `<=` release condition.
- If no chair has ever been freed, `nxtChair` is the smallest unused chair.
- Distinct arrival times avoid tie-breaking between arrivals.

## Complexity

- Time: `O(n log n)` for sorting and heap operations.
- Space: `O(n)`.
