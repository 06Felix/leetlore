## Idea

- Sort lengths, fix the largest side, and count compatible smaller pairs using inward-moving pointers.

## Why It Works

- For sorted sides only the sum of the two smaller sides must exceed the largest. If the leftmost candidate works with the right side, every index between left and right also works, adding right−left pairs. Otherwise increasing left is the only way to reach a larger sum.

## Edge Cases

- Zero lengths cannot pass the strict triangle inequality. Repeated lengths remain distinct index choices.

## Complexity

- O(n²) time and O(log n) sorting stack space.

## Notes

- Sorting modifies the input array.
