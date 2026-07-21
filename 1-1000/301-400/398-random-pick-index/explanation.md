# Random Pick Index

## Idea

- During construction, map each value to the list of indexes where it appears.
- For `pick(target)`, fetch the target's index list.
- Use `Random.nextInt(list.size())` to choose one position uniformly.
- Return the index stored at that random list position.

## Why It Works

- Every valid target index is stored exactly once in its value's list.
- Choosing a random integer from `0` to `size - 1` gives each list entry equal probability.
- The problem guarantees `target` exists, so the list lookup is valid.

## Edge Cases

- A target with one occurrence always returns that index.
- Negative and large values are valid hash-map keys.
- Repeated calls are independent random choices from the same stored list.

## Complexity

- Constructor time: $O(n)$.
- `pick` time: $O(1)$.
- Space: $O(n)$ for stored indexes.
