# Earliest Second to Mark Indices I

## Idea

- The solution binary-searches the earliest feasible second.
- `canMarkAll` checks whether all indices can be marked using only seconds `0..last`.
- The check runs backward: the first time an index is seen from the end is reserved as its marking second.
- Earlier duplicate occurrences can be used as decrement seconds, reducing the accumulated decrement need.

## Why It Works

- If all indices can be marked by some second, they can also be marked by any later second, so binary search applies.
- Working backward reserves the latest possible marking moment for each index, leaving earlier seconds for decrements.
- When an index is first marked in the backward scan, `arr[idx]` decrement operations must be available before that marking.
- Feasibility requires every index to be marked and the total decrement need to be fully paid by extra earlier seconds.

## Edge Cases

- If the full schedule cannot mark all indices, the method returns `-1`.
- Indices are converted from 1-based to 0-based once at the start.
- Zero-valued indices still need a marking occurrence but add no decrement need.

## Complexity

- Time: $O(mn \log m)$ is avoided; this implementation is $O(m \log m)$ checks over `m` seconds with $O(n)$ marker allocation per check.
- Space: $O(n)$ per feasibility check.
