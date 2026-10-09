## Idea
- For each new segment, test three crossing patterns using only the preceding five distances.
- Detect crossing the segment three steps earlier, overlapping the segment four steps earlier, or crossing the segment five steps earlier after a shrinking turn.

## Why It Works
- With positive lengths and fixed counterclockwise turns, the first crossing must fit one of these three local configurations: ordinary crossing, aligned overlap, or an inward transition reaching an older side.
- The comparisons test whether the relevant perpendicular or collinear segments reach each other. Non-strict inequalities also include endpoint touches.

## Edge Cases
- Three or fewer segments cannot cross under the stated positive-length rule.
- Overlaps and endpoint contacts count as crossing; growing outward paths fail all three tests.

## Complexity
- O(n) time with a constant number of checks per segment.
- O(1) auxiliary space; distances are unchanged.
