# Maximum Running Time of N Computers

## Idea

- Sum and sort the batteries. While the largest remaining battery exceeds the average energy per remaining computer, dedicate it to one computer and remove both from the pooled problem. Return the final pooled average rounded down.

## Why It Works

- For target duration T, a battery contributes at most min(capacity, T). A battery larger than the current average cannot share its surplus simultaneously across computers, so assigning it to one computer loses no attainable runtime. Once no battery exceeds the average, the remaining energy can be scheduled by swapping to attain floor(sum / n).

## Edge Cases

- With one computer, all battery capacities can be used sequentially. With exactly one battery per computer, removing oversized batteries exposes the limiting capacity.

## Complexity

- O(b log b) time and O(log b) sorting stack space for b batteries; the removal scan is O(b).

## Notes

- Sorting mutates batteries. The positive-capacity constraints ensure the loop stops before exhausting computers, so division by zero is avoided. Total energy uses long.
