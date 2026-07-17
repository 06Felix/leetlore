# Explanation

## Idea

- Traverse the whole tree.
- Insert every node value into a `TreeSet`, which stores distinct values in sorted order.
- Return the second sorted value if it exists; otherwise return `-1`.

## Why It Works

- The second minimum value means the second distinct value in sorted order.
- `TreeSet` removes duplicates and keeps values ordered.
- After traversal, index `1` of the sorted distinct values is exactly the answer.

## Edge Cases

- A tree with only one distinct value returns `-1`.
- Duplicate minimum values are counted once.
- Small node count makes converting the set to an array acceptable here.

## Complexity

- Time: $O(n \log n)$.
- Space: $O(n)$ for the set and recursion stack.
