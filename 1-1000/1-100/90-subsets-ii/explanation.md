# Explanation

Problem: [Subsets II](https://leetcode.com/problems/subsets-ii/)

## Idea

- Sort `nums` so duplicate values are adjacent.
- Run backtracking from a start index, adding the current path to the answer at every call.
- At each depth, skip `nums[i]` when it equals the previous value and the previous value was not chosen at this same depth.
- Choose a value, recurse to the next index, then remove it from the path.

## Why It Works

- Sorting groups equal values, making duplicate choices easy to detect locally.
- Each recursive call represents one unique subset prefix and records it before adding more elements.
- The duplicate skip prevents starting two branches at the same depth with the same value.
- Recursing only to later indices preserves subset order and prevents reusing an element.

## Edge Cases

- All values equal still produces only the subsets with `0..n` copies.
- A one-element input produces the empty subset and the singleton subset.
- Negative numbers need no special handling because sorting and equality checks still work.

## Complexity

- Time: $O(n 2^n)$ including copying generated subsets.
- Space: $O(n)$ recursion/path space, excluding the output.
