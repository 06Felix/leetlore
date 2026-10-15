# Count Operations to Obtain Zero

## Idea

- Batch repeated subtractions using division: add n1 / n2 to the answer, replace n1 by its remainder, and swap the two operands. Stop when either is zero.

## Why It Works

- Subtracting the smaller positive operand repeatedly from the larger produces precisely the quotient number of operations and the remainder. Swapping then gives the next Euclidean step without changing the process.

## Edge Cases

- An initial zero returns zero. Equal positive inputs contribute one operation. If n1 < n2, a zero-quotient iteration only swaps them.

## Complexity

- O(1 + log(max(num1, num2) + 1)) time and O(1) auxiliary space.

## Notes

- This computes the number of elementary subtractions without simulating them individually.
