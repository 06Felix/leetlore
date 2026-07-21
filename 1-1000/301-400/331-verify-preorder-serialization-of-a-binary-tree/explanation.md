# Verify Preorder Serialization of a Binary Tree

## Idea

- Track available child slots with `d`.
- Start with one slot for the root.
- Each token consumes one slot.
- A non-null token creates two new child slots; `#` creates none.

## Why It Works

- Every serialized node, null or non-null, must occupy exactly one available slot.
- Non-null nodes add two slots for their children, matching binary-tree structure.
- If slots go negative, a token appears where no node can exist.
- A valid serialization must consume all slots exactly by the end.

## Edge Cases

- `#` alone is valid because it consumes the root slot.
- Extra tokens after a complete tree make `d` negative.
- Missing null markers leave `d > 0` at the end.

## Complexity

- Time: $O(n)$ over tokens.
- Space: $O(n)$ from `split(",")`.
