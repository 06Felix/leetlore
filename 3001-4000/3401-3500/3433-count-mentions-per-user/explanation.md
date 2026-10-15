# Count Mentions Per User

## Idea

- Sort events by numeric timestamp, putting OFFLINE before MESSAGE when timestamp strings match. Record each user’s last offline timestamp. ALL increments everyone, HERE checks whether 60 time units have elapsed, and explicit IDs increment once per token.

## Why It Works

- Chronological processing makes the most recent offline timestamp sufficient to determine availability. Using timestamp >= offline + 60 restores users before same-time messages, and processing an offline event first excludes newly offline users. Explicit mentions ignore availability and preserve duplicates.

## Edge Cases

- HERE at the exact return time includes the user. ALL includes offline users. Initial timestamps of -61 mark every user online before any event.

## Complexity

- O(E log E + E * U + T) time under the bounded timestamp format, where E is the event count, U the user count, and T the total message text length. O(E + U + L) auxiliary space for sorting, status, and temporary token arrays of maximum message length L.

## Notes

- Sorting mutates events. The tie branch compares timestamp strings rather than parsed values: numerically equal spellings such as 01 and 1 bypass OFFLINE-first ordering and can give incorrect HERE counts. Canonical identical timestamp spellings avoid that risk.
