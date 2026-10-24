# 2409. Count Days Spent Together

## Idea

- Convert every `MM-DD` date into its day number within the year.
- Each person's visit is then an inclusive integer range.
- The shared visit starts at the later arrival and ends at the earlier departure.

## Why It Works

- Any day before the later arrival is missing one person.
- Any day after the earlier departure is also missing one person.
- Therefore, all shared days are exactly the inclusive range `[max(arrivals), min(departures)]`.
- If the range is reversed, the visits do not overlap and the answer is zero.

## Edge Cases

- The `+1` is necessary because both arrival and departure dates are included.
- Dates in different months work because `day` adds the lengths of all earlier months.
- The given year is not a leap year, so February has 28 days.

## Complexity

- Time: `O(1)`
- Space: `O(1)`

## Tags

- String
- Simulation
- Interval
