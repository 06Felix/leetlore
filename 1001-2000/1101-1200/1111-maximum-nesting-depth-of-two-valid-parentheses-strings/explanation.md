# 1111. Maximum Nesting Depth of Two Valid Parentheses Strings

## Idea

- The original string is already valid.
- We split its parentheses into two groups, `0` and `1`.
- To keep the maximum depth as small as possible, alternate ownership by depth.

## How the Code Works

- `depth` is the current nesting level.
- For `'('`, we increase depth first, then assign the parenthesis using `depth & 1`.
- For `')'`, we assign using the current depth first, then decrease depth.
- This gives each matching pair the same group number.

## Why It Works

- Since each matching pair receives the same label, both subsequences stay valid.
- Alternating by depth spreads nested layers between the two groups.
- If the original maximum depth is `d`, one of the two groups must receive at least about half of those nested layers. This method reaches that bound.

## Edge Cases

- A flat string like `"()()"` may put all pairs in one group, which is fine because the depth is already `1`.
- A deeply nested string gets split level by level.
- Returning either valid optimal split is accepted by the problem.

## Complexity

- Time: `O(n)`
- Space: `O(n)` for the returned answer

## Tags

- String
- Greedy
- Stack
