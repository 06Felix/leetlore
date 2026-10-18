# Build an Array With Stack Operations

## Idea

- Read stream values from one upward. Emit Push for every value; emit Pop when it is not the next target value. Advance the target pointer on matches and stop immediately when all target values are retained.

## Why It Works

- The target is strictly increasing, so each stream value is either the next required element or can never belong to the final stack. Retaining matches and immediately discarding gaps builds exactly the target in order; stopping on the last match obeys the required early termination.

## Edge Cases

- A target starting above one requires Push/Pop pairs for initial gaps. A prefix target stops before reading the remaining stream.

## Complexity

- O(target[last]) time and returned operation storage, with O(1) extra working space.

## Notes

- The target values are guaranteed at most n, so the loop always finishes the target without accessing beyond it.
