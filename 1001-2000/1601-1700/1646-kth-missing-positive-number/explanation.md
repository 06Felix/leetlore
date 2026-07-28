# Explanation

## Idea

Simulate positive integers in increasing order with `prev`. Walk through `arr` whenever the next expected value exists; otherwise count it as missing.

After the array is exhausted, continue counting positive integers beyond its last value.

## Why It Works

The array is strictly increasing, so at any point `prev + 1` is the next positive value to check.

If it equals `arr[i]`, that value is present and not missing. Otherwise it is missing, so decrement `k`. The first time `k` reaches zero, that missing value is the answer.

## Edge Cases

- Missing values before `arr[0]` are counted because `prev` starts at `0`.
- If the answer is beyond the array, the second loop advances until the remaining missing count is consumed.
- Consecutive present values just move the array pointer forward.

## Complexity

Time: `O(arr.length + k)` in this implementation.

Space: `O(1)`.
