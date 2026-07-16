# Find Polygon With the Largest Perimeter

## Idea

- The solution sorts the side lengths.
- It starts with the sum of all sides and treats the largest remaining side as the polygon's longest side.
- If the sum of all other sides is greater than that longest side, the current set forms a polygon.
- Otherwise it removes the current largest side and tries again.

## Why It Works

- For sorted positive side lengths, a polygon exists exactly when the longest side is smaller than the sum of the others.
- To maximize perimeter, it is best to try using as many total side lengths as possible first.
- If the largest side is too large, no polygon including it can work with the current smaller sides, so removing it is necessary.
- The first valid check while moving downward gives the largest possible perimeter.

## Edge Cases

- Three equal sides pass immediately.
- If every candidate longest side is too large, the answer is `-1`.
- `long` is used for the perimeter because sums can exceed `int`.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: depends on the sort implementation; the scan uses $O(1)$ extra space.
