## Idea

- Compare the midpoint with its right neighbor. Keep the left half including midpoint on a descending slope, otherwise keep the right half.

## Why It Works

- A rising slope leads to a peak somewhere to the right before the conceptual −∞ boundary; a falling slope leaves a peak on the left. Each update preserves an interval with a peak. Unequal adjacent values make the slope strict, and the final singleton is a peak.

## Edge Cases

- A singleton returns zero. Monotone arrays peak at a boundary.

## Complexity

- O(log n) time and O(1) space.
