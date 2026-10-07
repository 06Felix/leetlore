# Explanation

## Idea
- Count the required letters of `s1`; track `req`, the number of still-missing occurrences in the current `s2` window.
- Adding a letter decreases its remaining count and reduces `req` only if that occurrence was needed.
- Whenever all required occurrences are present, shrink from the left until a requirement becomes missing, returning true if a complete window has exactly `s1.length()` characters.

## Why It Works
- Negative letter counts represent extras, while positive counts represent shortages. `req == 0` means the window contains all required multiplicities.
- Such a window with the target length has no extras and is a permutation. Removing leading extras examines smaller complete windows before dropping a needed occurrence.
- Both endpoints advance monotonically, so every relevant complete window is considered without backtracking.

## Edge Cases
- Repeated target letters require the matching multiplicity.
- A target longer than `s2` cannot fit; irrelevant window letters can be removed without increasing `req`.

## Complexity
- Time: $O(|s1| + |s2|)$ because each endpoint advances at most once per position.
- Space: $O(|s1| + 26)$ for the target's `toCharArray` copy and frequency array.
