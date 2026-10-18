# Shuffle the Array

## Idea

- Walk the first half with index i and the second half with index j starting at n. Append one entry from each half into the next two result positions.

## Why It Works

- After t iterations, exactly the first t pairs x1,y1 through xt,yt have been written. The two input pointers advance together until all n pairs are emitted.

## Edge Cases

- n = 1 writes the single pair. Equal values are preserved independently by position.

## Complexity

- O(n) time and O(1) working space beyond the O(n) returned array.

## Notes

- The algorithm allocates a new array and leaves nums unchanged.
