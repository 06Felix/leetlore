## Idea

- AND all misplaced indices; return zero when the permutation is already sorted.

## Why It Works

- The common set bits of every position that must participate are exactly the bits permitted in k, so their AND is the largest feasible value.

## Edge Cases

- An already sorted permutation needs k = 0.

## Complexity

- O(n) time and O(1) space.
