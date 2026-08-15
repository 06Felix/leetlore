# Longest Subsequence With Non-Zero Bitwise XOR

## Idea

- First take the XOR of the whole array.
- If that value is already non-zero, keeping every element is best, so the answer is `n`.
- If the whole XOR is zero, removing one non-zero number `x` makes the remaining XOR equal to `x`.
- If every number is zero, no subsequence can ever have a non-zero XOR.

## Why It Works

- The longest possible subsequence has length `n`, so we use it whenever its XOR is valid.
- When the full XOR is zero, a length `n` answer is impossible.
- For any non-zero element `x`, removing it changes the XOR from `0` to `0 ^ x = x`, which is non-zero.
- That gives a valid subsequence of length `n - 1`, and no longer valid subsequence can exist in this case.

## Edge Cases

- Single non-zero number: answer is `1`.
- Single zero: answer is `0`.
- Full array XOR is non-zero: answer is immediately `n`.
- Full array XOR is zero but at least one value is non-zero: answer is `n - 1`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Bit Manipulation
- XOR
- Greedy
- Array
