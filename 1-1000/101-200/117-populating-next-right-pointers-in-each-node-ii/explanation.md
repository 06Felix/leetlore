## Idea

- Traverse each level through its existing next chain. Append left and right children to a temporary next-level chain behind a dummy node, then begin the next iteration at that chain’s head.

## Why It Works

- The current chain visits parents left to right. Appending each parent’s children in left/right order produces exactly the next level’s left-to-right sequence. Induction over levels connects all nodes correctly.

## Edge Cases

- Empty roots return null. Sparse levels and parents with a single child work without special cases. Initial next pointers are guaranteed null, leaving each new level’s last node null.

## Complexity

- O(n) time and O(1) live auxiliary space.

## Notes

- One dummy node is allocated per level but only the current dummy is needed. Existing next pointers are populated in place.
