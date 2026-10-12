## Idea

- Maintain the distinct OR values ending at each position and add them to a global set.

## Why It Works

- Every subarray ending at the current index extends a prior ending subarray or starts here; ORing collapses duplicates without losing any result.

## Edge Cases

- The set naturally handles repeated OR values.

## Complexity

- O(n·B) typical time and O(n·B) space.
