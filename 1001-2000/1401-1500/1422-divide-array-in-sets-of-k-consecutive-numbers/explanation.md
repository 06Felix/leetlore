# Divide Array in Sets of K Consecutive Numbers

## Idea

- Count every number in a `TreeMap` so keys are processed in increasing order.
- At each smallest remaining start value, take its remaining count `value`.
- Subtract `value` from every number in `[start, start + k - 1]`.
- If any needed number goes negative, the partition is impossible.

## Why It Works

- The smallest remaining number cannot be placed behind any smaller number, so it must start `value` groups.
- Those `value` groups require the next `k - 1` consecutive values.
- Subtracting `value` from the whole window commits all groups forced by `start`.
- If all forced groups can be formed, every count eventually reaches zero.

## Edge Cases

- Missing a required consecutive value makes its count negative and returns `false`.
- If `nums.length` is not divisible by `k`, the subtraction process eventually fails.
- `k = 1` always succeeds because each number forms its own group.

## Complexity

- Time: $O(n \log m)$ amortized for `n` numbers and `m` distinct keys.
- Space: $O(m)$ for the frequency map.

## Notes

- The implementation may insert a missing key with a negative count during a failing check, but it returns immediately in that case.
