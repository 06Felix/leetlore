# Generate Binary Strings Without Adjacent Zeros

## Idea

- Build strings recursively with a shared `StringBuilder`.
- Append `0` only when the current string is empty or the previous character is `1`.
- Always try appending `1`, because it can never create adjacent zeros.

## Why It Works

- The only invalid length-2 substring is `"00"`.
- The recursion prevents `"00"` at the moment a `0` would be appended.
- When the remaining length reaches zero, every adjacent pair already satisfies the rule, so the built string is valid.

## Edge Cases

- For `n = 1`, both `"0"` and `"1"` are generated.
- Backtracking deletes the appended character after each recursive branch, so sibling branches do not interfere.
- Output order is not constrained by the problem.

## Complexity

- Time: `O(A * n)`, where `A` is the number of valid strings produced.
- Space: `O(n)` recursion depth, excluding the returned strings.
