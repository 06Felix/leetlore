# Distribute Elements Into Two Arrays II

## Idea

- The Python solution keeps both output arrays and matching `SortedList` structures.
- For each next value, it computes how many elements in each array are strictly greater using `bisect_right`.
- The value goes to the array with the larger greater-count.
- Ties are broken by shorter length, then by `arr1`.

## Why It Works

- `len(sortedList) - sortedList.bisect_right(x)` is exactly the number of elements greater than `x`.
- The branch logic follows the problem's distribution rules in priority order.
- Updating both the plain array and sorted list keeps output order and future count queries correct.
- Concatenating `arr1` and `arr2` produces the required final result.

## Edge Cases

- Equal greater-counts use array length as the next tie-breaker.
- Equal lengths append to `arr1`.
- Duplicate values are handled correctly because `bisect_right` excludes values equal to the current number.

## Complexity

- Time: $O(n \log n)$ with balanced sorted-list operations.
- Space: $O(n)$ for arrays and sorted lists.
