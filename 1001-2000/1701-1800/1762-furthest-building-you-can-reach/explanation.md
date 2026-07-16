# Furthest Building You Can Reach

## Idea

- The solution considers only positive climbs between adjacent buildings.
- It pushes each climb into a min-heap.
- The heap represents climbs currently assigned to ladders.
- If there are more climbs than ladders, the smallest climb is paid with bricks instead.

## Why It Works

- Ladders should be reserved for the largest climbs seen so far.
- A min-heap lets the algorithm replace the smallest ladder-assigned climb with bricks whenever too many climbs need help.
- If bricks become negative after paying the smallest non-ladder climb, no allocation can reach the current building.
- Otherwise each step has an optimal allocation among climbs seen so far.

## Edge Cases

- Downhill or equal-height moves cost nothing.
- With zero ladders, every positive climb is paid with bricks.
- If all climbs are affordable, the answer is the last index.

## Complexity

- Time: $O(n \log L)$, where `L` is the number of ladders plus one heap capacity.
- Space: $O(L)$.
