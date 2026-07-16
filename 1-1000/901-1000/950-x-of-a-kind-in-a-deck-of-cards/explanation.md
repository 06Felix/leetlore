# X of a Kind in a Deck of Cards

## Idea

- The implementation counts how many times each card value appears.
- It computes the greatest common divisor of all frequency counts.
- If the final gcd is at least `2`, that gcd can be used as the group size.
- Otherwise no valid group size greater than `1` divides every count.

## Why It Works

- Every group must contain identical card values, so each card value's frequency must be divisible by the chosen group size.
- A common group size exists exactly when all frequencies have a common divisor greater than `1`.
- The gcd of all frequencies is the largest possible common divisor.
- Therefore `gcd >= 2` is both necessary and sufficient.

## Edge Cases

- A deck with one card has gcd `1` and returns `false`.
- Prime frequency counts can still work if all counts share the same prime factor.
- Different card values are independent except for the shared group size.

## Complexity

- Time: $O(n + u \log n)$, where `u` is the number of distinct card values.
- Space: $O(u)$.
