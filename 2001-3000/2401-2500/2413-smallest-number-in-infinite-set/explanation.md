# Smallest Number in Infinite Set

## Idea

- Keep `curr` as the smallest positive number that has never been popped.
- Keep a `TreeSet` named `added` for smaller numbers that were popped and later added back.
- `popSmallest` returns the smallest added-back number if present; otherwise it returns `curr` and increments it.
- `addBack` only stores numbers less than `curr`, because larger numbers are already present in the infinite tail.

## Why It Works

- Every number at least `curr` has never been removed, so it is still in the set.
- Any removed number smaller than `curr` must be tracked explicitly if it is added back.
- `TreeSet.first()` gives the smallest added-back number, which beats all numbers in the infinite tail.
- Set semantics avoid duplicate added-back entries.

## Edge Cases

- Calling `addBack` on a number still present does nothing.
- Re-adding the current or larger number is ignored because it was not removed.
- Repeated pops with no add-back return `1, 2, 3, ...`.

## Complexity

- `popSmallest`: $O(\log a)$ when `added` is non-empty, otherwise $O(1)$.
- `addBack`: $O(\log a)$ for `a` added-back values.
- Space: $O(a)$.
