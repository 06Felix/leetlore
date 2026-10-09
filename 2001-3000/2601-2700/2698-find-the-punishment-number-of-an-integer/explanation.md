## Idea
- Include 1², then test each i from two through n by recursively partitioning the decimal digits of i².
- Grow the next contiguous chunk one digit at a time and recurse with its value subtracted from the remaining target. Add i² if any partition consumes all digits with target zero.

## Why It Works
- Choosing each possible chunk endpoint enumerates all contiguous partitions.
- Chunk values are nonnegative and cannot decrease as more digits are appended, so stopping when a chunk exceeds the remaining target cannot discard a valid partition.

## Edge Cases
- n = 1 returns one; zero-valued chunks are allowed, as in 100 splitting into 10 and 0.
- A successful partition may use the entire square or several chunks. Under n <= 1000, squares and the accumulated answer fit int.

## Complexity
- O(n d 2^d) is a conservative time bound, where d is the maximum digit count of a square, at most seven here.
- O(d) auxiliary space for the digit array and recursion.
