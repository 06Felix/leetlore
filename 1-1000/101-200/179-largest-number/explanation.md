# Largest Number

## Idea

- Convert each number to a string.
- Sort strings so `a` comes before `b` when `a + b` is larger than `b + a`.
- Concatenate the sorted strings to form the largest possible number.

## Why It Works

- For any adjacent pair, the better order is determined by comparing the two possible concatenations.
- Sorting by that pairwise rule makes every local pair ordered for the maximum concatenated value.
- If the first sorted string is `"0"`, every value is zero, so the result should be `"0"` instead of repeated zeros.

## Edge Cases

- Inputs like `[0, 0]` return `"0"`.
- Numbers with shared prefixes, such as `3` and `30`, are handled by comparing `330` versus `303`.
- The `nums.length == 0` guard is unreachable under the constraints and does not affect valid inputs.

## Complexity

- Time: `O(n log n * d)`, where `d` is the maximum string length involved in comparator concatenations.
- Space: `O(n * d)` for the string array and output builder.
