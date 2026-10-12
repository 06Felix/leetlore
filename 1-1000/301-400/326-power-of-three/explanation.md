## Idea

- Multiply by three until reaching or exceeding n.

## Why It Works

- The loop visits precisely the positive powers of three in increasing order.

## Edge Cases

- Non-positive n returns false; long avoids intermediate int overflow.

## Complexity

- O(log₃ n) time and O(1) space.
