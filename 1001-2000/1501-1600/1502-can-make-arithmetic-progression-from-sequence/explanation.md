# Can Make Arithmetic Progression From Sequence

## Idea

- Sort the array and verify that each pair of neighboring gaps is equal.

## Why It Works

- If the values can form an arithmetic progression, their ascending order is also one, with a nonnegative common difference. Equal adjacent gaps therefore characterize exactly the rearrangeable inputs.

## Edge Cases

- Any two-element array succeeds. Repeated values are allowed only when the common difference is zero throughout.

## Complexity

- O(n log n) time and O(log n) sorting stack space.

## Notes

- Sorting mutates arr. Differences remain within int range under the stated value bounds.
