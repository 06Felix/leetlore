# Number of Smooth Descent Periods of a Stock

## Idea

- Track dp, the length of the smooth-descent run ending at the current day. Extend it when the price drops by exactly one; otherwise reset it to one. Add dp to a long total each day.

## Why It Works

- A run of length dp has exactly dp smooth-descent suffixes ending on the current day. Summing by ending index counts every valid period once, including all single-day periods.

## Edge Cases

- A single day returns one. Equal prices, rises, and drops larger than one restart the run.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The answer may reach n(n + 1)/2, so ans is long even though each run length fits int. The input is unchanged.
