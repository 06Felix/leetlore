# Rabbits in Forest

## Idea
- Count occurrences of each reported answer `x`; rabbits reporting `x` belong to color groups of size `x + 1`.
- Charge for a new full group whenever the number already seen for that answer is divisible by the group size.

## Why It Works
- A group can hold at most `x + 1` reporters with answer `x`, so $f$ such reports require $\lceil f/(x+1)\rceil$ groups.
- Opening a group at occurrence counts 0, `x + 1`, and so on implements that ceiling. Filling groups greedily realizes the lower bound.
- Different reported answers cannot belong to the same color group, so their contributions add independently.

## Edge Cases
- Each zero answer contributes one rabbit of its own color.
- A partially filled final group still needs its unobserved rabbits; repeated answers beyond a full group open another group.

## Complexity
- Time: $O(n+1000)$, including initialization of the fixed count array.
- Space: $O(1000)=O(1)$ under the bounded answer range.
