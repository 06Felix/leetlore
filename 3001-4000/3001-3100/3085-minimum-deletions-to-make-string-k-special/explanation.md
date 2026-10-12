## Idea

Count the 26 letters. Try every positive original frequency as the minimum retained frequency: delete smaller frequencies entirely and trim larger ones to minimum + k.

## Why It Works

For a fixed minimum, these are the cheapest necessary deletions. In an optimal choice of retained letters, raising the minimum to the smallest original frequency among those letters never increases deletions: no retained letter needs to be raised, and the upper bound becomes looser. Thus one of the tested frequencies achieves an optimum.

## Edge Cases

Absent letters are ignored. A single retained letter is always valid; k = 0 requires equal retained frequencies.

## Complexity

O(n + 26²) time and O(n + 26) space, including the character array.

## Notes

Only characters still present contribute to the frequency comparison.
