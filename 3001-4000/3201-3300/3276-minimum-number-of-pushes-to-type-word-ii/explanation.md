# Explanation

Problem: [Minimum Number of Pushes to Type Word II](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/)

## Idea

- Count how often each letter appears.
- Sort the 26 frequencies.
- Assign the largest 8 frequencies cost `1`, the next 8 cost `2`, then cost `3`, and so on.
- Sum `frequency * assignedCost` for all used letters.

## Why It Works

- There are 8 usable keys, so at most 8 letters can have one-push cost.
- The next layer of letters on those keys costs two pushes, and so on.
- To minimize total pushes, higher frequencies must receive lower costs; otherwise swapping a more frequent letter to a cheaper slot would reduce the total.
- Sorting frequencies descending and assigning increasing layer costs implements this optimal exchange argument.

## Edge Cases

- Unused letters have frequency `0` and are ignored.
- Words with at most 8 distinct letters give every used letter cost `1`.

## Complexity

- Time: $O(|word| + 26 \log 26)$.
- Space: $O(26)$.

## Notes

- The implementation sorts ascending, then reads frequencies from the end.
