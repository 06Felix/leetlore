# 2897. Apply Operations on Array to Maximize Sum of Squares

## Idea

- The operation does not change how many times each bit appears across the whole array.
- It only moves bits between numbers.
- Since squares reward larger numbers, the best plan is to pack remaining bits into the chosen numbers as much as possible.

## How the Code Works

- Count how many numbers contain each bit.
- Build `k` numbers one by one.
- For each new number, take every bit that is still available and decrease that bit count.
- Add the square of the built number to the answer modulo `1e9 + 7`.

## Why It Works

- For any bit, the operation can move that bit from one number to another while preserving the total count of that bit.
- Combining bits into the same number is better for the square sum than spreading them out.
- Greedily building a number with all currently available bits creates the largest possible next chosen value.
- Repeating this `k` times gives the maximum sum for the `k` selected numbers.

## Edge Cases

- If a bit count becomes zero, that bit cannot be used again.
- If fewer useful bits remain before all `k` numbers are built, later numbers may become `0`.
- `long` is used before taking modulo because `num * num` can exceed `int`.

## Complexity

- Time: `O((n + k) * 31)`
- Space: `O(31)`

## Tags

- Array
- Greedy
- Bit Manipulation
