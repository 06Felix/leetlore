# 1-bit and 2-bit Characters

## Idea

- Decode from the left, advancing one position for a leading zero and two for a leading one. Stop when the index reaches or passes the final bit, and test whether it lands exactly there.

## Why It Works

- Each character boundary has a uniquely determined length: 0 is a one-bit character and 1 starts a two-bit character. Landing on the final zero makes it a separate character; stepping past it means it was consumed by the preceding character.

## Edge Cases

- A single zero returns true. Runs of ones before the final zero are handled by the same decoding rule.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The algorithm uses the statement guarantee that bits ends in zero.
