## Idea

- Scan each square region for uniform values. Return a leaf if uniform; otherwise recursively build four equal quadrants under an internal node.

## Why It Works

- A uniform region is exactly representable by one leaf. A mixed region decomposes into disjoint quadrants whose recursive representations together cover every cell. Repeating this rule produces the required quad tree.

## Edge Cases

- A one-cell region is always uniform. Power-of-two side lengths guarantee equal integer quadrant sizes.

## Complexity

- O(n² log(n+1)) conservative time and O(log n) auxiliary stack space, plus O(n²) worst-case output nodes.

## Notes

- The value true on internal nodes is permitted by the statement; only leaf values encode uniform regions.
