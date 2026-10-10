## Idea
- Count even values by writing one zero at the next output position for each even input value.
- Fill all remaining positions with one and return the same array.

## Why It Works
- The required sorted result consists only of a block of zeros followed by a block of ones, so only the number of even inputs matters.
- The zero write index never exceeds the current scan position: writes affect only already-read cells or the current cell, preserving every future parity test.

## Edge Cases
- All-even input becomes all zeros; all-odd input becomes all ones.
- A singleton is converted to its parity value.

## Complexity
- O(n) time for the scan and suffix fill.
- O(1) auxiliary space; nums is transformed in place.
