# Explanation

## Idea

- Store every restaurant from `list1` with its index in a map.
- Scan `list2`; when a name appears in the map, compute the index sum.
- Keep all names tied for the smallest index sum seen so far.

## Why It Works

- The map gives the `list1` index for each common restaurant in $O(1)$ average time.
- Each common restaurant is evaluated with its exact `i + j` score.
- Clearing the answer on a smaller score and appending on equal scores leaves exactly the minimum-score restaurants.

## Edge Cases

- Multiple restaurants can tie; all are retained.
- Unique names in each list avoid duplicate handling.
- The statement guarantees at least one common string, so the result is non-empty.

## Complexity

- Time: $O(n + m)$ average.
- Space: $O(n + k)$ for the map and answer list.
