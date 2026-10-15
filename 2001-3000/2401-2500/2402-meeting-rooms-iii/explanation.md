# Meeting Rooms III

## Idea

- Sort meetings by original start. Keep available room IDs in one min-heap and occupied rooms in another ordered by completion time then ID. Release all rooms free by a meeting’s start; use the smallest free ID, or delay in the earliest-finishing room.

## Why It Works

- Processing original starts in order gives earlier meetings priority over later ones. The free heap enforces the smallest-ID rule; when none is free, the occupied heap identifies the earliest legal start and its correct tie-break. Adding the original duration preserves meeting length.

## Edge Cases

- Rooms finishing exactly at a start are free. Equal completion times choose the smaller room ID. The final ascending scan keeps the smallest ID when booking counts tie.

## Complexity

- O(m log m + m log(n + 1)) time and O(m + n) auxiliary space including object-array sorting, for m meetings and n rooms.

## Notes

- Sorting mutates meetings. Delayed completion times use long. Heap scheduling matched an independent room-scan simulation on 400 small random cases.
