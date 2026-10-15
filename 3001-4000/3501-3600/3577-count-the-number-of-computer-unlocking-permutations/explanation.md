# Count the Number of Computer Unlocking Permutations

## Idea

- Reject if any later computer has complexity at most complexity[0]. Otherwise compute (n - 1)! modulo 1000000007.

## Why It Works

- Unlocking chains from computer zero strictly increase complexity, so a computer no more complex than zero is unreachable. If every other complexity is larger, computer zero can unlock any of them directly; all orders of the remaining n - 1 computers are valid.

## Edge Cases

- A later complexity equal to the first one fails because the comparison must be strict. Equal complexities among other computers do not restrict their order.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- Computer zero remains the root and occupies the initial position in the counted unlocking orders, consistent with the examples.
