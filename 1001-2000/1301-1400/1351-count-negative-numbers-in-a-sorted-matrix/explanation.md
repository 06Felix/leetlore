# Count Negative Numbers in a Sorted Matrix

## Idea

- Binary-search each nonincreasing row for its first negative entry. Add the number of entries from that position to the row’s end, or zero if no negative exists.

## Why It Works

- Once a negative appears in a nonincreasing row, every later entry is negative. Binary search locates precisely that boundary; summing row counts counts each negative once.

## Edge Cases

- Entirely negative rows contribute their full length; entirely nonnegative rows contribute zero. Single-column rows work without entering the search loop.

## Complexity

- O(rows * log(cols + 1)) time and O(1) auxiliary space.

## Notes

- This implementation uses only row ordering and does not achieve the optional O(rows + cols) follow-up bound. The input is unchanged.
