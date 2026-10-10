## Idea
- Scan a virtual extension of the circular array through index n + k - 2, reading colors modulo n.
- Reset the candidate left endpoint whenever adjacent colors match. On reaching length k, count the group and advance left by one.

## Why It Works
- After a reset, every adjacent pair in the maintained interval alternates.
- Advancing left after counting permits overlapping windows. The virtual extension includes exactly the n distinct starting positions, including groups crossing the array boundary.

## Edge Cases
- Equal neighbors break all windows spanning that pair.
- A fully alternating circle contributes n groups; k = n still counts starts separately.

## Complexity
- O(n + k) time, which is O(n) because k <= n.
- O(1) auxiliary space; colors is unchanged.
