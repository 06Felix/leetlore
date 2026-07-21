# Find Duplicate Subtrees

## Idea

- Serialize each subtree with postorder recursion.
- Use `""` as the null serialization.
- Count each serialization in a map.
- When a serialization count becomes exactly `2`, add that subtree root to the answer.

## Why It Works

- Two subtrees are duplicates exactly when their root values and left/right subtree structures match.
- The serialization `value#left#right` captures both structure and values.
- Adding only at count `2` reports one representative per duplicate shape.
- Later repeats of the same subtree do not add duplicate answer entries.

## Edge Cases

- A leaf serializes from its value plus two null serializations.
- Negative values are safe because `#` separates fields.
- A tree with no duplicate serialization returns an empty list.

## Complexity

- Time: $O(n^2)$ worst case because serialized strings can grow with subtree size.
- Space: $O(n^2)$ worst case for stored serializations.
