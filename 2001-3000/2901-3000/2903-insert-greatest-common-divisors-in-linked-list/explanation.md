# Explanation

## Idea

Walk the linked list pair by pair. For each adjacent pair, compute their gcd and insert a new node between them.

After inserting, jump to the original next node and continue.

## Why It Works

Each required inserted node depends only on the two original neighboring values. The implementation keeps the original next node as `inserted.next`, so the list structure remains connected.

Moving to `inserted.next` avoids treating the newly inserted gcd node as part of the next original pair.

## Edge Cases

- A single-node list has no adjacent pair and is returned unchanged.
- Gcd is computed by Euclid's algorithm.
- Node values are positive, so gcd results are positive.

## Complexity

Time: `O(n log V)`, where `V` is the maximum node value.

Space: `O(1)` extra besides inserted nodes.
