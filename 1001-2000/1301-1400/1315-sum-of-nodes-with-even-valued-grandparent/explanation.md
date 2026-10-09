## Idea
- DFS while carrying the parent and grandparent values.
- Add the current node when the carried grandparent is even, then pass the current value as parent and the old parent as grandparent to each child.

## Why It Works
- The carried values represent exactly the two ancestors needed for each node's test.
- Every node is visited once, so summing qualifying values counts each eligible node exactly once.

## Edge Cases
- Initial values of -1 represent absent ancestors and are odd, so the root and its children do not qualify accidentally.
- A singleton or a tree without even-valued grandparents returns zero.

## Complexity
- O(n) time and O(h) auxiliary space for recursion, where h is tree height.
- A skewed tree has h = n.

## Notes
- A valid skewed tree can require 10,000 recursive calls and may overflow the Java stack.
