## Idea
- Serialize in preorder, writing each value followed by its left and right subtrees; write the token n for a null child.
- Deserialize by consuming tokens in that same order, recursively building a node's left and right children.

## Why It Works
- Explicit null tokens preserve the tree's shape, including missing left or right children.
- For a fresh Codec's first deserialize call, each recursive call consumes exactly one subtree encoding, reconstructing both values and structure.

## Edge Cases
- An empty tree serializes as n followed by a space and reconstructs as null.
- Negative and repeated values are supported because structure is carried by null markers rather than inferred from values.

## Complexity
- O(n) time for either operation under the bounded node-value lengths.
- Serialization uses O(n) output space and O(h) recursion; deserialization uses O(n) token storage and O(h) recursion, plus the reconstructed tree.

## Notes
- Correctness risk: the field id is never reset in deserialize. A second deserialize call on the same Codec continues at the old token index and can throw ArrayIndexOutOfBoundsException or reconstruct the wrong tree. For example, calling deserialize("n ") twice fails on the second call.
- A skewed tree can require 10,000 recursive calls and may overflow the Java stack.
