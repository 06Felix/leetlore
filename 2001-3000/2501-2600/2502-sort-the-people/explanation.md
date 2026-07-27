# Explanation

Problem: [Sort the People](https://leetcode.com/problems/sort-the-people/)

## Idea

- Pair each height with its corresponding name.
- Sort the pairs by height descending.
- Write the sorted names back into the `names` array.
- Return `names`.

## Why It Works

- Each pair preserves the original association between one person and their height.
- Sorting by descending height puts taller people before shorter people.
- Writing names in sorted-pair order produces exactly the requested name order.
- Heights are distinct, so no tie-breaking is required.

## Edge Cases

- A single person array is already sorted.

## Complexity

- Time: $O(n \log n)$.
- Space: $O(n)$.

## Notes

- The implementation uses `Pair<Integer, String>` and mutates the input `names` array.
