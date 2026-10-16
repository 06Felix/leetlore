# Analyze Organization Hierarchy

## Idea

- Build a recursive CTE with one row per employee, then repeatedly move its manager pointer upward while retaining the original employee ID and salary. Root-reaching rows give hierarchy levels; grouping all non-NULL ancestor pointers gives each manager’s descendant count and salary sum.

## Why It Works

- Each employee contributes exactly once to each ancestor in a valid hierarchy. Thus grouping pointer rows counts all direct and indirect reports without counting the manager itself, while retaining the descendant salary computes their budget contribution. Adding the manager’s own salary completes the budget.

## Edge Cases

- A leaf gets team size zero and its own salary. The CEO reaches a NULL manager at level one for itself, and more distant descendants reach it at larger levels.

## Complexity

- For N employees and height H, the CTE contains O(N * H) rows, worst-case O(N^2). With suitable joins and aggregation, this dominates work/storage before final O(N log N) sorting; plans may add lookup or grouping costs.

## Notes

- The query assumes acyclic, root-connected manager chains. Deep hierarchies can exceed the database recursive-CTE depth limit. A multilevel SQLite fixture passed; MySQL recursion limits and execution were not tested.
