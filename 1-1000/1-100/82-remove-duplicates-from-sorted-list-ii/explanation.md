## Idea

- Use a dummy predecessor and scan to the last node of each equal-value run. Keep the run only if its first and last node are the same; otherwise bypass the entire run.

## Why It Works

- Sorted order makes all equal values contiguous. prev.next points to the run’s original first node, so comparing it with the run’s last node detects whether duplicates occurred. Bypassing duplicate runs and advancing past singleton runs retains exactly values appearing once.

## Edge Cases

- Empty lists and duplicate runs at the head or tail are handled by the dummy node. An all-duplicate list becomes empty.

## Complexity

- O(n) time and O(1) auxiliary space.
