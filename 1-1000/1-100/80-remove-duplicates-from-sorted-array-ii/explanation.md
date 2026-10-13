## Idea

- Reserve the first two values. Append later values only when they differ from the output value two positions before the write index.

## Why It Works

- For input length at least two, sorted order ensures equality with that earlier output value means two copies are already retained. Otherwise the current value may be appended. This preserves order and limits each run to two values.

## Edge Cases

- Length-two and all-distinct arrays retain their contents; long duplicate runs retain two copies.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- Correctness bug: cur starts at two even for the allowed one-element input. For nums=[1], the method returns two rather than one. The argument above assumes length at least two; the stored solution is unchanged.
