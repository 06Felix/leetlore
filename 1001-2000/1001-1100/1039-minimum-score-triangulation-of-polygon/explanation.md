## Idea

- Use interval DP. For each interval [i,j], try every interior vertex k and combine both subpolygon scores with values[i]·values[k]·values[j].

## Why It Works

- Every triangulation has one triangle incident to edge (i,j). Its third vertex splits the remaining polygon into two independent intervals. Trying all third vertices and taking both intervals’ optima covers every triangulation; increasing interval dependencies are already computed by the loop order.

## Edge Cases

- Intervals with fewer than three vertices have zero score. Positive vertex values make zero a safe sentinel for an uncomputed nontrivial interval.

## Complexity

- O(n³) time and O(n²) space.
