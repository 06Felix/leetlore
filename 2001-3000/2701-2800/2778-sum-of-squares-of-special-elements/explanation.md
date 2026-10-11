# 2778. Sum of Squares of Special Elements

## Idea

- The array is described as 1-indexed, but Java arrays are 0-indexed.
- So the actual problem index for `nums[i]` is `i + 1`.
- An element is special when that index divides `n`.

## How the Code Works

- Store the array length in `n`.
- Loop through every Java index `i`.
- If `n % (i + 1) == 0`, add `nums[i] * nums[i]` to the answer.

## Why It Works

- The condition in the statement is exactly `n % index == 0`.
- Since `index = i + 1`, checking `n % (i + 1)` maps the statement directly to Java indexing.
- Every special element is added once, and no non-special element is added.

## Edge Cases

- Index `1` always divides `n`, so the first element is always included.
- If `n = 1`, the only element is special.
- The loop naturally handles all divisors of `n`, including `n` itself.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Array
- Math
- Simulation
