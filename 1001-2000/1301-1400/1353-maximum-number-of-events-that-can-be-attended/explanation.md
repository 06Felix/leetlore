## Idea

- Sort events by start day. Scan every day through the last ending day, removing expired events and adding newly available events to a min-heap of end days. Attend the event with the earliest end day.

## Why It Works

- Among available events, choosing the earliest deadline preserves the most future flexibility. Any schedule choosing a later deadline today can swap the earliest-deadline event into today without reducing its event count. Repeating the exchange proves the greedy schedule optimal.

## Edge Cases

- An event ending today is still eligible. Duplicate intervals remain separate events, and empty days are skipped by the daily scan.

## Complexity

- O(n log n+D) time and O(n) auxiliary space, where D is the maximum end day.

## Notes

- Sorting changes the event array order. The implementation scans empty calendar days as well as occupied days.
