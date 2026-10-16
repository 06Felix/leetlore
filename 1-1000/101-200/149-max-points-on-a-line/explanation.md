# Max Points on a Line

## Idea

- For each anchor, count later points by a Pair key produced from their relative slope. Add the largest key count to the anchor and any duplicate-anchor count, then maximize over anchors.

## Why It Works

- With collision-free direction keys, points sharing a direction from an anchor are collinear. Considering the earliest-indexed point on an optimal line would count all its later members. The implementation attempts this grouping, but its special axis keys can collide as described below.

## Edge Cases

- A single point returns one. Duplicate-anchor handling exists even though the statement guarantees distinct points.

## Complexity

- Expected O(n^2 log C) time and O(n) space, including Euclidean GCD work for coordinate-difference bound C.

## Notes

- Correctness bug: vertical lines use (0, anchorX), while horizontal lines use (anchorY, 0). At anchor (0, 0), both become (0, 0). Thus points [[0,0],[0,1],[1,0]] return 3 although the correct answer is 2. The existing solution is left unchanged. Pair also relies on the judge-provided type.
