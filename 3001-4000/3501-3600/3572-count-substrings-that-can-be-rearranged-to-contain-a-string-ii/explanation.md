# Count Substrings That Can Be Rearranged to Contain a String II

## Idea

- Count the target character requirements from `word2`.
- Slide a window over `word1`, adding one right character at a time.
- While the window satisfies all target counts, add all right-side extensions and move `left` forward.

## Why It Works

- Rearrangement only depends on character multiset counts, not order.
- If the current window has enough of every required character, any longer substring with the same start and larger end is also valid.
- The left pointer advances only while validity holds, so every valid substring is counted exactly once at the earliest right endpoint that makes it valid.

## Edge Cases

- Large `word1` is processed with two pointers and fixed-size arrays.
- Duplicate required characters are handled by exact frequency thresholds.
- Windows shorter than `word2` cannot pass the frequency check.

## Complexity

- Time: `O(26 * n)`, effectively linear for lowercase English letters.
- Space: `O(1)`.

## Notes

- The implementation checks all 26 counts inside `isValidPrefix` for each shrink attempt. This is still fixed-alphabet linear time, though it does more constant work than maintaining a separate satisfied-count variable.
