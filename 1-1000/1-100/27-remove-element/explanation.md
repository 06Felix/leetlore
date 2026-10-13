## Idea

- Scan all values and write each value unequal to val into the next free prefix position. Return the prefix length.

## Why It Works

- After each scanned index, the output prefix contains exactly the accepted values seen so far. The write position never exceeds the read position, so overwriting cannot destroy unread values.

## Edge Cases

- An empty array returns zero. All removed values give an empty prefix; the suffix is irrelevant to the judge.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The ct counter is updated but does not affect the returned result.
