# My Calendar I

## Idea

- Store accepted bookings in a `TreeMap` keyed by start time.
- For a new interval `[start, end)`, find the existing booking with the greatest start time less than `end`.
- The new booking is valid only if that candidate booking ends at or before `start`.

## Why It Works

- Any interval that could overlap `[start, end)` and starts before `end` is represented by `lowerKey(end)`.
- The latest such start is the only one that can still extend past `start`; earlier intervals end no later than this one in a valid calendar ordering.
- If its end is `<= start`, there is no overlap and the new interval can be inserted.

## Edge Cases

- Back-to-back intervals like `[10, 20)` and `[20, 30)` are allowed.
- If there is no existing start before `end`, the booking is safe.
- A rejected booking is not inserted.

## Complexity

- Time: `O(log n)` per `book` call.
- Space: `O(n)` for stored bookings.
