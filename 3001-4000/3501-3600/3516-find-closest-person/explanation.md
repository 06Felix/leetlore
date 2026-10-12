## Idea

- Compare the absolute distances from x and y to z. Return the person with the shorter distance or zero for a tie.

## Why It Works

- Both people move at the same speed, so arrival time is proportional to distance. The comparison therefore determines exactly who arrives first.

## Edge Cases

- A person already at z has distance zero; equal distances produce a tie.

## Complexity

- O(1) time and auxiliary space.
