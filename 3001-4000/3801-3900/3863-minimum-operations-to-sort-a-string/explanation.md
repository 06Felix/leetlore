# 3863. Minimum Operations to Sort a String

## Idea

- The answer can only be `0`, `1`, `2`, `3`, or `-1`.
- First check whether the string is already sorted. While doing that, record its smallest and largest characters.
- The positions of those extreme characters determine how many proper-substring sorts are needed.

## Why It Works

- If the string is sorted already, no operation is needed.
- An unsorted string of length two cannot change: its only proper substrings have length one.
- If the minimum is already first, sorting the suffix finishes the string. If the maximum is already last, sorting the prefix does the same.
- Otherwise, an extreme character in the middle gives a two-operation construction. If both extremes are trapped at the opposite ends, three operations are necessary and sufficient.

## Edge Cases

- The sorted check must compare adjacent characters: `str[i - 1] > str[i]`.
- Run the sorted check before the length-two case, because a sorted two-character string needs zero operations.
- Repeated copies of the minimum or maximum can make the one- or two-operation cases possible.

## Complexity

- Time: `O(n)`
- Space: `O(1)` aside from the character array

## Tags

- String
- Greedy
- Case Analysis
