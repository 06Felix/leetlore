# Explanation

## Idea

- Mark every jewel character in a boolean ASCII table.
- Scan `stones`.
- Count each stone whose character is marked as a jewel.

## Why It Works

- Characters are case-sensitive, so direct character indexing preserves distinction between `a` and `A`.
- The boolean table answers membership in $O(1)$.
- Counting marked stones gives exactly the number of stones that are jewels.

## Edge Cases

- If no stones are jewels, the count remains `0`.
- Repeated stones are counted individually.
- Unique jewel characters avoid duplicate setup concerns.

## Complexity

- Time: $O(j + s)$.
- Space: $O(1)$, fixed 128-entry table.
