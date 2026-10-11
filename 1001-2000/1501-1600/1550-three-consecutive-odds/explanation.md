# Three Consecutive Odds

## Idea
- Track the length of the current run of odd values using the low bit.
- Reset the run after an even value and return true as soon as the run reaches three.

## Why It Works
- After each value, the counter equals the number of consecutive odd values ending at that position.
- Reaching three therefore witnesses a qualifying contiguous triple; if it never occurs, no triple exists.

## Edge Cases
- Arrays shorter than three return false.
- Longer odd runs succeed at their first three values, while an even value breaks any partial run.

## Complexity
- Time: $O(n)$ worst case with early success.
- Space: $O(1)$ auxiliary storage.
