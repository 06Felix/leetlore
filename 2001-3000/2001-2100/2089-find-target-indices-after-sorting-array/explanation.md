# 2089. Find Target Indices After Sorting Array

## Idea

- Sorting is not actually necessary.
- Count how many values are smaller than `target` and how many equal it.
- After sorting, all smaller values come first. The target values immediately follow them.

## Why It Works

- If `less` values are smaller than `target`, the first target occurrence must be at index `less`.
- If `same` values equal `target`, they occupy the consecutive indices `less` through `less + same - 1`.
- No target values means `same` is zero, so the returned list is empty.

## Complexity

- Time: `O(n)`
- Space: `O(1)`, excluding the returned list

## Tags

- Array
- Counting
