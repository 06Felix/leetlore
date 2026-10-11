# Find the Maximum Sum of Node Values

## Idea
- Independently choose the larger of each value and its XOR with `k`, tracking how many choices use XOR.
- If that count is odd, subtract the smallest absolute difference between a value and its XOR alternative.

## Why It Works
- Each edge operation toggles two nodes, so the number of nodes toggled an odd number of times must be even.
- Every even-size node set is achievable in a connected tree: pair its nodes and apply operations along the paths between them; intermediate toggles cancel.
- Independent maximization is optimal when its parity is even. Otherwise changing one choice with the smallest loss fixes parity at the minimum possible cost.

## Edge Cases
- No advantageous XOR choices means no operations are needed.
- Parity repair can either undo a beneficial change or add a nonbeneficial one. Totals use `long`; value differences fit `int` under the given bounds.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.

## Notes
- The edges are unused because only connectivity and even toggle parity matter; this reduction relies on the valid-tree guarantee.
- The implementation computes only the optimum sum and does not construct an operation sequence.
