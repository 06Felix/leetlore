# 3551. Minimum Swaps to Sort by Digit Sum

## Idea

- Sort the original indices by the required order: digit sum first, then the number itself.
- After sorting those indices, `pos[i]` tells which original element must move to sorted position `i`.
- This mapping is a permutation. Its cycles give the minimum number of swaps.

## Why It Works

- A cycle containing `k` misplaced positions can be fixed in exactly `k - 1` swaps.
- Different cycles are independent, so adding `k - 1` for every cycle gives the global minimum.
- The numbers are distinct, making the final sorted position for every element unambiguous.

## Edge Cases

- An element already in its final position forms a cycle of size one and needs zero swaps.
- Equal digit sums are resolved by the numeric value, exactly as required.

## Complexity

- Time: `O(n log n)`
- Space: `O(n)`

## Tags

- Sorting
- Array
- Graph
- Permutation Cycle
