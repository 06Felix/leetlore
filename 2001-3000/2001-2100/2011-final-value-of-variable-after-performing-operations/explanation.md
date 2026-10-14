# Final Value of Variable After Performing Operations

## Idea

- Start at zero and inspect the middle character of every operation. A plus sign increments the answer; a minus sign decrements it.

## Why It Works

- All four allowed spellings have the arithmetic sign at index 1. The running total is therefore exactly the variable value after each operation.

## Edge Cases

- Prefix and postfix spellings have identical effects here; increments and decrements can cancel.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The code assumes the four valid operation strings specified by the statement.
