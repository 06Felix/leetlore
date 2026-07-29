# 132 Pattern

## Idea

- Scan the array from right to left.
- Maintain a decreasing stack of possible `nums[j]` values.
- Track `k`, the best candidate for the middle value `nums[k]` in a `132` pattern.
- If a current value is smaller than `k`, a valid `nums[i] < nums[k] < nums[j]` pattern exists.

## Why It Works

- Scanning from the right ensures stack values and `k` come from indices after the current index.
- When `nums[i]` is larger than stack values, popped values can serve as the `2` in the pattern because the current value can serve as the larger `3`.
- `k` stores the largest popped candidate, making it easiest for a later left-side value to be smaller than it.
- Finding `nums[i] < k` completes the required index order and value order.

## Edge Cases

- Strict inequalities are preserved by popping only values smaller than the current value.
- Negative numbers work because comparisons are numeric and `k` starts at `Integer.MIN_VALUE`.
- Arrays with fewer than three useful positions naturally return `false`.

## Complexity

- Time: `O(n)`, since each value is pushed and popped at most once.
- Space: `O(n)` for the stack.
