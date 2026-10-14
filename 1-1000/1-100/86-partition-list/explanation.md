## Idea

- Build two chains from existing nodes: values below x and values at least x. Terminate the second chain and connect it after the first.

## Why It Works

- Appending each encountered node to its category tail preserves the original order within that category. Concatenating the chains establishes the required partition. Clearing the second tail prevents original links from reconnecting into the first chain or forming a cycle.

## Edge Cases

- Either chain may be empty; an empty input returns null. Values equal to x belong to the second chain.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input nodes are reused and their links are modified.
