# Running Sum of 1d Array

## Idea

- Keep a running total `sum` while scanning the array left to right.
- Add the current number into `sum`.
- Write that updated total into the same index of the answer array.

## Why It Works

- After processing index `i`, `sum` equals `nums[0] + ... + nums[i]`.
- Assigning that value to `ans[i]` directly matches the required running sum definition.
- Each output position depends only on the previous total and the current number.

## Edge Cases

- A single-element input returns that element.
- Negative values are handled naturally by integer addition.
- Zero values leave the running total unchanged for that position.

## Complexity

- Time: `O(n)`, where `n` is `nums.length`.
- Space: `O(n)` for the returned array.
