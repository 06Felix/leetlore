## Idea

- Traverse the BST in order, tracking the previous visited node and the smallest consecutive value difference.

## Why It Works

- Inorder values are sorted. Any nonadjacent difference is a sum of nonnegative adjacent gaps and cannot be smaller than every adjacent gap. Comparing neighbors therefore finds the global minimum.

## Edge Cases

- At least two nodes are guaranteed. The first node has no predecessor and does not update the minimum.

## Complexity

- O(n) time and O(h) recursion space.

## Notes

- State reuse risk: ans and previousNode are not reset by getMinimumDifference, so a reused object can compare against a node from an earlier tree or retain an old minimum. Deep skewed trees may also exceed stack capacity.
