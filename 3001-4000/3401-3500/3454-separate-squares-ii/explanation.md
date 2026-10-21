# Separate Squares II

## Idea
- Sweep bottom/start and top/end events in increasing y order. Maintain x-coordinate coverage deltas for the active squares in a `TreeMap`.
- Between successive event heights, scan those x deltas to find the union width, recording each positive-area horizontal slab.
- Sum slab areas, then locate the first slab reaching half the total and interpolate the split height inside it.

## Why It Works
- Active coverage is constant between adjacent y events, so union area in a slab is its union x-width times its height.
- Scanning sorted x endpoints and counting only gaps with positive coverage merges overlaps without counting them twice.
- Events at the same height contribute no intervening area. Processing all events therefore partitions the full union correctly, and the first half-area crossing gives the minimum split height.

## Edge Cases
- Nested, duplicate, overlapping, and edge-touching squares are handled by coverage counts.
- If half the area is reached at a slab's upper boundary, that boundary is returned before any later empty gap.

## Complexity
- $O(n\log n+n^2)$ worst-case time: each of $O(n)$ height slabs may rescan $O(n)$ stored x endpoints.
- $O(n)$ auxiliary space for events, endpoint deltas, and recorded slabs.

## Notes
- Performance risk: the repeated full x-map scans can be too slow for 50,000 squares. This implementation uses no segment tree to maintain union width incrementally.
- `11.93` is a fallback sentinel; valid positive-area inputs should return during the slab scan. The result uses floating-point area arithmetic and interpolation.
