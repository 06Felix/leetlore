## Idea

- Sum every positive adjacent price increase.

## Why It Works

- Any transaction’s profit telescopes into adjacent changes and cannot exceed the sum of their positive parts. Buying and selling across each increasing run attains that sum while holding at most one share.

## Edge Cases

- A decreasing or constant series yields zero; one day provides no gain.

## Complexity

- O(n) time and O(1) auxiliary space.
