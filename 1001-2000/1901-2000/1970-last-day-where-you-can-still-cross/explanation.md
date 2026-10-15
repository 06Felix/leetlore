# Last Day Where You Can Still Cross

## Idea

- Binary-search the last feasible day. For each candidate day, mark that many flooded cells, then run multi-source BFS from every dry top-row cell and test whether any path reaches the bottom row.

## Why It Works

- Flooding only removes land, so crossing feasibility is monotone in the day count. BFS visits exactly the land reachable from the top; reaching the bottom is equivalent to a valid crossing. Binary search returns the day just before the first infeasible one.

## Edge Cases

- The public constraints guarantee at least two rows and columns, so reaching the bottom requires a move and day one remains feasible. The fully flooded final day is infeasible.

## Complexity

- O(row * col * log(row * col)) time and O(row * col) auxiliary space for each temporary matrix and BFS queue.

## Notes

- The temporary matrix marks both water and visited land as one. The input cells array is unchanged. The day search deliberately excludes the known boundary days zero and row * col.
