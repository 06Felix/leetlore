## Idea

- Sort lengths and scan consecutive triples from the largest end. Return the first triple satisfying the strict triangle inequality.

## Why It Works

- For a fixed largest side, its two immediate predecessors maximize both the smaller-side sum and the perimeter. If they fail, no smaller pair can work with that largest side. The first feasible triple dominates all triples whose largest side is earlier.

## Edge Cases

- Equal-side triangles are allowed; a degenerate triple with equal summed sides is rejected. No feasible triple returns zero.

## Complexity

- O(n log n) time and O(log n) sorting stack space.

## Notes

- Sorting modifies the input array.
