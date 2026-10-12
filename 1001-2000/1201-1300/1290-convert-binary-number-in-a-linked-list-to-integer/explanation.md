## Idea

- Walk from the most significant bit to the least significant bit. Shift the accumulated value left once and OR in the next node’s bit.

## Why It Works

- After each node, the accumulator equals the binary prefix read so far. Appending a binary digit multiplies that prefix by two and adds the digit, exactly what the shift and OR perform.

## Edge Cases

- Leading zeros and a single zero node are handled naturally. At most 30 bits fit in a signed int.

## Complexity

- O(n) time and O(1) auxiliary space.
