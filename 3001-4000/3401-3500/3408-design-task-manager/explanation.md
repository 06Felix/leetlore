## Idea

- Keep tasks in an ID lookup map and a TreeSet ordered by descending priority, then descending task ID. Editing removes the old task and inserts a replacement; execution removes the first ordered task.

## Why It Works

- The set order puts exactly the required task first. Map and set updates always occur together, preserving the same live tasks in both structures. Replacement on edit ensures the ordered set never holds an object whose ordering fields change in place.

## Edge Cases

- Executing an empty set returns −1. Tied priorities select the larger task ID; a removed ID may later be added again.

## Complexity

- O(n log(n+1)) initialization, O(log(n+1)) per operation, and O(n) live-task space.

## Notes

- The comparator’s subtractions fit int under the priority and task-ID bounds.
