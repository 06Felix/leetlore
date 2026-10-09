## Idea
- Use a shared cursor to recursively parse the expected node depth.
- Count upcoming dashes without consuming them; if their count differs from the expected depth, return null. Otherwise consume the dashes and numeric value, then parse left and right children at depth + 1.

## Why It Works
- Preorder places a node before its child subtrees; depth markers show exactly when a subtree ends.
- Leaving mismatched markers unconsumed allows the appropriate ancestor to parse the next sibling. Parsing left first follows the guarantee that a sole child is left.

## Edge Cases
- Multi-digit values are consumed as one node value.
- A leaf returns null children on depth mismatch; sibling depth drops are handled through recursive returns.

## Complexity
- O(L + nh) is a conservative time bound for input length L, n nodes, and height h, because depth mismatches can rescan dash prefixes.
- O(h) auxiliary recursion plus O(n) reconstructed-tree space.

## Notes
- The cursor i is never reset in recoverFromPreorder. Reusing one Solution instance for a second call can parse from the old end position and throw or produce an incorrect tree.
