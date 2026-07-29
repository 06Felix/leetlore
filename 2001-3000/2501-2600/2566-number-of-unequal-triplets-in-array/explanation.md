# Number of Unequal Triplets in Array

## Idea

- Count the frequency of each distinct value.
- Iterate over the frequency groups.
- For each group used as the middle value choice, multiply the number of elements before it, inside it, and after it.

## Why It Works

- A valid triplet needs three pairwise distinct values.
- Choosing one element from three different value groups gives an unequal triplet.
- During the group scan, `prev` counts elements in already-processed groups and `next` counts elements in later groups, so `prev * freq * next` counts all triplets using the current group as the middle group.
- Summing this over groups counts each three-group choice exactly once.

## Edge Cases

- If all numbers are equal, either `prev` or `next` is always zero, so the answer is `0`.
- Duplicate values are handled by their group frequency.
- Hash map iteration order does not matter because only group partitions into before/current/after are counted once per scan order.

## Complexity

- Time: `O(n + u)`, where `u` is the number of distinct values.
- Space: `O(u)`.
