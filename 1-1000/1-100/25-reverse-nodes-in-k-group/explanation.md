## Idea

- Count the list length, then reverse each complete k-node group by repeatedly moving the group tail’s next node to the group front. Advance the predecessor and tail after each group.

## Why It Works

- The head-insertion moves reverse exactly k nodes while keeping a connection to the following group. Processing only floor(length/k) groups leaves the incomplete suffix intact. Induction over groups yields the required full list.

## Edge Cases

- k=1 returns the original list. The final partial group is never modified.

## Complexity

- O(n) time over a length pass and reversal pass, and O(1) auxiliary space.

## Notes

- Only node links change, satisfying the value-preservation restriction and constant-space follow-up.
