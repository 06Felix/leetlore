# Explanation

## Idea
- Sort the piles in ascending order and reserve the smallest third for Bob.
- Among the remaining piles, take every other pile starting at index `piles.length / 3`; pair each chosen pile with the larger pile immediately after it for Alice.

## Why It Works
- Giving Bob the smallest piles preserves all larger candidates for Alice and you.
- Each pile you receive needs a pile at least as large for Alice. Pairing the remaining largest piles in adjacent pairs maximizes the sum of their smaller members.
- Together with one reserved Bob pile, each pair forms a valid round.

## Edge Cases
- Three piles return the middle value after sorting.
- Equal pile sizes do not change the selection rule; the answer fits in `int` under the stated limits.

## Complexity
- Time: $O(m \log m)$ for sorting `m` piles, followed by an $O(m)$ scan.
- Auxiliary space: typically $O(\log m)$ for the primitive-array sort's stack; the selection scan uses $O(1)$.

## Notes
- `Arrays.sort` changes the input array's order.
