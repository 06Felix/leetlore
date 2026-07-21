# Minimum Increment to Make Array Unique

## Idea

- Sort `nums`.
- Track `mA`, the smallest value the next number is allowed to take.
- For each `num`, add `max(mA - num, 0)` moves when it must be raised.
- Update `mA` to one more than the assigned value.

## Why It Works

- After sorting, handling smaller values first is optimal because numbers can only increase.
- If `num < mA`, the cheapest unique assignment is exactly `mA`.
- If `num >= mA`, it can stay unchanged.
- Advancing `mA` maintains the next unused minimum value.

## Edge Cases

- Already unique sorted values add zero moves.
- Many equal values are spread into consecutive positions.
- Large duplicates remain within the 32-bit answer guarantee.

## Complexity

- Time: $O(n \log n)$ from sorting.
- Space: $O(1)$ extra besides sorting implementation details.
