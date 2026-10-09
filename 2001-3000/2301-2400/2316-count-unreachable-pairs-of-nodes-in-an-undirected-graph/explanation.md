## Idea
- Union all edge endpoints, using path compression and storing each component's size at its root.
- Scan roots. For a component of size s, add s times the number of vertices in components not yet processed, then remove s from the remaining count.

## Why It Works
- Vertices are unreachable from one another exactly when they belong to different connected components.
- Each pair of components contributes the product of their sizes, and subtracting processed sizes ensures each unordered vertex pair is counted once.

## Edge Cases
- One connected component gives zero; n isolated vertices give n(n - 1) / 2.
- Repeated connections within a component leave its size unchanged. Long arithmetic prevents overflow of the pair total.

## Complexity
- O(n(n + e)) is a conservative worst-case time bound without balanced union; path compression improves repeated finds.
- O(n) auxiliary space for parent and size arrays and the recursive find stack.

## Notes
- Component sizes are maintained, but union does not use them to choose the parent. Adversarial edge order can create a chain of up to 100,000 vertices, causing recursive find to overflow the Java stack.
