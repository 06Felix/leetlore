# Length of the Longest Alphabetical Continuous Substring

## Idea

- Track the current run length `rLen`.
- Extend the run when the current character is exactly one greater than the previous character.
- Reset the run to `1` otherwise, and keep the maximum seen length.

## Why It Works

- An alphabetical continuous substring requires each adjacent pair to advance by one letter.
- The implementation checks that local condition for every adjacent pair.
- Any break makes a longer continuous substring impossible across that boundary, so resetting is correct.

## Edge Cases

- A one-character string returns `1`.
- Runs ending at the last character are counted because `ans` is updated on extension.
- `"za"` does not extend because the character code does not increase by one.

## Complexity

- Time: `O(n)`, where `n` is `s.length()`.
- Space: `O(1)`.
