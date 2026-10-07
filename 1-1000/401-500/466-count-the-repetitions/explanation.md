# Explanation

## Idea
- Scan every character across all `n1` repetitions of `s1`, cycling its source index instead of building the repeated string.
- Advance the `s2` index whenever the current source character matches; reset it and count a completed `s2` after a full match.
- Divide the completed-copy count by `n2` to obtain the number of complete target groups.

## Why It Works
- Matching each required character at its earliest available source position leaves the largest remaining suffix for later matches, maximizing completed target copies.
- A partial final copy contributes nothing. Each requested repeated target consumes `n2` complete `s2` copies, so integer division gives the answer.

## Edge Cases
- Missing required letters can leave the completed-copy count at zero.
- Matches can cross boundaries between source repetitions; an unfinished target copy is ignored.

## Complexity
- Time: $O(n1\cdot |s1| + |s2|)$, including the character-array copies.
- Auxiliary space: $O(|s1| + |s2|)$ for those arrays.

## Notes
- The implementation has no cycle skipping and can scan 100 million source characters at the maximum constraints. Its result logic is direct, but this workload can be a runtime risk under a strict time limit.
