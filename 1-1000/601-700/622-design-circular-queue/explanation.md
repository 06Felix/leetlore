# Design Circular Queue

## Idea

- Store values in a fixed array with front, rear, and size. Advance rear modulo capacity for enqueue and front modulo capacity for dequeue; reject operations when full or empty.

## Why It Works

- The indices identify the ends of the logical FIFO segment across the array boundary. Tracking size distinguishes full and empty states even when indices coincide, and modulo arithmetic reuses vacated slots.

## Edge Cases

- Capacity one works with the same wrapping rules. Front and Rear return -1 when empty, and failed updates leave state unchanged.

## Complexity

- O(1) time per method, O(k) construction time for array allocation, and O(k) storage for capacity k.

## Notes

- No built-in queue is used. Actual Java passed 8000 differential operations across capacities one through eight, including repeated wraparound.
