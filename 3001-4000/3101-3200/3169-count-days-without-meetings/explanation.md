# Count Days Without Meetings

## Idea
- Sort meetings by their starting day and track the greatest ending day seen so far.
- Subtract only the previously uncovered portion of each inclusive interval from `days`.

## Why It Works
- After sorting, earlier meetings cover all meeting days before the current start up to `prevEnd` where intervals overlap.
- Starting new coverage at `max(meeting[0], prevEnd + 1)` avoids counting any occupied day twice; fully contained intervals subtract zero.
- Removing the union's length from the total leaves exactly the days without meetings.

## Edge Cases
- Nested, overlapping, and adjacent meetings are handled without double counting.
- A meeting covering day 1 through the last day leaves zero; gaps before, between, and after meetings remain counted.

## Complexity
- Time: $O(m\log m)$ for $m$ meetings.
- Space: $O(m)$ worst-case sorting workspace for Java's object-array sort; the scan uses $O(1)$ extra space.

## Notes
- Sorting reorders the input `meetings` array in place.
- The adjusted length may be negative for contained meetings; `max(length, 0)` intentionally discards it.
