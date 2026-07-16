# Maximum Number of Operations With the Same Score I

## Idea

- In this version, each operation always deletes the first two remaining elements.
- The first pair fixes the required score.
- The solution scans the array in later pairs: indices `(2, 3)`, `(4, 5)`, and so on.
- It stops as soon as a pair sum differs from the first score.

## Why It Works

- Because deletion is always from the front, the operation order is fixed.
- Every valid operation after the first must have the same score as `arr[0] + arr[1]`.
- Once a pair differs, no later pair can be reached under the rules.
- Counting matching consecutive pairs gives the maximum number of operations.

## Edge Cases

- Arrays of length two always allow one operation.
- An odd trailing element is ignored because fewer than two elements remain.
- The unused map in the submitted code does not affect behavior.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ effective space.
