# Explanation

## Idea

- Keep a temporary bucket for each possible group size.
- Add each person index to the bucket matching `groupSizes[i]`.
- When a bucket reaches its required size, append it to the answer and replace it with a fresh bucket.

## Why It Works

- Every person in one bucket has the same required group size.
- A bucket is emitted only when it contains exactly that many people.
- Resetting the bucket allows another group of the same size to be formed later.

## Edge Cases

- Group size `1` emits immediately.
- Multiple groups with the same size are handled by resetting the bucket.
- The statement guarantees a valid grouping exists.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.
