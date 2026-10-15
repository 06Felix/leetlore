# Minimum Time to Make Rope Colorful

## Idea

- Scan maximal runs of equal colors. Add all removal costs in a run, track its maximum, then subtract that maximum before starting the next run.

## Why It Works

- At most one balloon may remain from each same-color run. Keeping the most expensive one minimizes removal cost. Keeping one from every original run preserves the differing colors between adjacent runs and achieves the summed minimum.

## Edge Cases

- A singleton run costs zero. If all colors match, remove every balloon except a maximum-cost one.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input arrays are unchanged; locMax is reset between runs.
