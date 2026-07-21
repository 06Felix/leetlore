# Minimum Number of Moves to Seat Everyone

## Idea

- Sort `seats` and `students`.
- Pair the smallest student position with the smallest seat, second smallest with second smallest, and so on.
- Add absolute differences for all pairs.

## Why It Works

- In one dimension, crossing assignments can be uncrossed without increasing total distance.
- Therefore an optimal matching pairs sorted positions in sorted order.
- Each absolute difference is exactly the moves needed for that student-seat pair.
- Summing all pairs gives the minimum total moves.

## Edge Cases

- Duplicate seat or student positions are fine after sorting.
- Students already in sorted matching positions add zero moves.
- Equal array lengths guarantee every student gets one seat.

## Complexity

- Time: $O(n \log n)$.
- Space: $O(1)$ extra besides sorting implementation details.
