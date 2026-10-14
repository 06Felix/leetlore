## Idea

- Keep unaffordable projects in a min-heap of capital requirements and eligible projects in a max-heap of profits. Move newly affordable projects before each selection and choose the largest available profit.

## Why It Works

- Nonnegative profits never reduce capital. Among currently feasible choices, the highest profit leaves at least as much capital as any alternative and cannot reduce future affordability. Exchanging it to the front of an optimal schedule preserves feasibility, establishing the greedy choice.

## Edge Cases

- If no project is affordable, stop. Each project moves between heaps once and is chosen at most once.

## Complexity

- O(n log n+min(k,n) log n) time and O(n) space.

## Notes

- Capital requirements gate selection but are not deducted; completed profit is added to current capital.
