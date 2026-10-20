# Number of Students Unable to Eat Lunch

## Idea

- Count students preferring each sandwich type. Process sandwiches from the top, consuming one matching preference count; stop when the next sandwich has no willing student and return the remaining sandwich count.

## Why It Works

- As long as at least one student wants the top sandwich, rotating the queue eventually brings such a student forward. Thus queue order does not affect which sandwich can be consumed; only the two remaining preference counts matter.

## Edge Cases

- A missing preference halts the entire process even if students want later sandwiches. Consuming all sandwiches returns zero.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input arrays are unchanged; the queue rotations are avoided entirely.
