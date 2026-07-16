# Sum of Subarray Minimums

## Idea

- The implementation counts each `arr[i]` by how many subarrays use it as the chosen minimum.
- A monotonic increasing stack finds the previous index with value `<= arr[i]` and the next index with value `< arr[i]`.
- `prevMin[i]` defaults to `-1`, and `nextMin[i]` defaults to `n` when no boundary exists.
- The contribution of `arr[i]` is `arr[i] * (i - prevMin[i]) * (nextMin[i] - i)`.

## Why It Works

- Any subarray where `arr[i]` is the selected minimum can start after `prevMin[i]` and at or before `i`.
- It can end at or after `i` and before `nextMin[i]`.
- Multiplying those choices gives the exact number of subarrays assigned to `i`.
- Using `>` while popping and keeping equal values on the stack assigns duplicate minima consistently to one side.

## Edge Cases

- Strictly increasing arrays keep most `nextMin` values at `n`.
- Strictly decreasing arrays pop many previous indices and set their next smaller boundary.
- Duplicate values are handled by the asymmetric `<=` previous boundary and `<` next boundary rule.

## Complexity

- Time: $O(n)$ because each index is pushed and popped at most once.
- Space: $O(n)$ for boundary arrays and the stack.
