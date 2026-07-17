# Explanation

## Idea

- Count how many times character `c` appears.
- Scan the string again from left to right.
- Each time `c` appears, add the current remaining count of `c`, then decrement it.

## Why It Works

- A valid substring is determined by choosing a start occurrence of `c` and an end occurrence of `c` at or after it.
- When processing a start occurrence, `cCount` equals the number of valid end choices remaining.
- Adding these counts over all occurrences computes $k + (k - 1) + \dots + 1$ for `k` occurrences.

## Edge Cases

- If `c` does not appear, the answer remains `0`.
- Single-character substrings are counted because an occurrence can serve as both start and end.
- `long` safely stores the result for `n` up to `10^5`.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ due to the character array.
