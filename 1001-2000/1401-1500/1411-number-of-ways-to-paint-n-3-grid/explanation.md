# Number of Ways to Paint N × 3 Grid

## Idea

- Track counts for rows using exactly two colors (ABA) and three colors (ABC), starting with six of each. Advance with nextTwo = 3 * two + 2 * three and nextThree = 2 * two + 2 * three, modulo 1000000007.

## Why It Works

- Every horizontally valid row has one of these two patterns. A fixed ABA row has three compatible ABA successors and two ABC successors; a fixed ABC row has two of each. Adding these disjoint possibilities preserves the number of valid grids by final-row type.

## Edge Cases

- n = 1 returns twelve. Computing both next counts before assignment prevents mixing old and new row states.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- Intermediate products use long before modular reduction.
