# All Paths From Source to Target

## Idea
- Depth-first search from node zero, pushing the current node onto a mutable path and marking it visited for that branch.
- At the target, copy the completed path into the result. Unmark and remove the node while returning so other paths can reuse it.

## Why It Works
- Each recursive branch follows one edge choice, so every recorded sequence is a source-to-target path.
- Every such path is explored through its sequence of choices. Branch-local marks prevent cycles without suppressing paths that share vertices across branches.
- Copying each completed path preserves it after the mutable working path is backtracked.

## Edge Cases
- No route to the target produces an empty result on a fresh instance.
- Shared suffixes are revisited from different prefixes, as required to enumerate distinct paths; the DAG guarantees paths cannot cycle.

## Complexity
- $O(n2^n)$ worst-case time and output space for a DAG with $n$ vertices.
- $O(n)$ auxiliary working space for visited flags, the current path, and recursion.

## Notes
- Instance-reuse bug: `ans` is never cleared. Calling the same object on `[[1],[]]` and then `[[],[]]` returns the old `[0,1]` path on the second call even though no path exists.
