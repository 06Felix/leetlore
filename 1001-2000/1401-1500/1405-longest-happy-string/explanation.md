# Explanation

## Idea
- Track the remaining counts of `a`, `b`, and `c`, plus each letter's current consecutive-run length.
- Prefer a letter with the largest remaining count unless its run already has length two. When a run of two blocks a letter, use an available alternative according to the code's `a`, then `b`, then `c` branch order.
- Reset the other run counters after each append and stop when no branch can append a legal letter.

## Why It Works
- The run counters prevent every forbidden three-letter repetition, while decrementing counts respects the supplied limits.
- Consuming abundant letters before scarce separators reduces the chance that too many copies of one letter remain at the end.
- When only a blocked letter remains, no further character can be appended. Excess copies beyond the available separator capacity must be left unused.

## Edge Cases
- If only one letter is available, at most two copies are returned.
- Zero counts, tied counts, and a strongly dominant letter are handled by the branch order and the run checks.

## Complexity
- Time: $O(a + b + c)$ for at most that many iterations.
- Space: $O(a + b + c)$ for the result builder, with $O(1)$ counters.
