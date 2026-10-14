## Idea

- DFS returns the best downward path beginning at each node. Ignore negative child gains, update a field with the path joining both children through the node, and return the node plus only the larger child gain.

## Why It Works

- A path has a highest node joining at most one branch on each side. The field checks exactly that full-path candidate at every node. A path extended to a parent can use only one child branch, so the returned gain preserves a simple path.

## Edge Cases

- All-negative trees still return the best real node because ans begins at Integer.MIN_VALUE. Zero gains may be discarded without loss.

## Complexity

- O(n) time and O(h) recursion space.

## Notes

- Runtime/state risks: a skewed 30000-node tree may overflow the Java stack. Also ans is not reset on each maxPathSum call, so reusing a Solution object can retain a larger result from a previous tree. The stored implementation is unchanged.
