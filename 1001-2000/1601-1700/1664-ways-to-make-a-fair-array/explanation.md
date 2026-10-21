# Ways to Make a Fair Array

## Idea

- Initialize even/odd sums on the right. At each index, remove its value from the right sum, test leftEven + rightOdd against leftOdd + rightEven, then add the removed value to the left for the next candidate.

## Why It Works

- Removing one position leaves earlier indices unchanged and flips the parity of every later index. The tested expressions are therefore exactly the even and odd sums of the remaining array. Each index is considered once.

## Edge Cases

- A single-element input has one valid removal because both remaining sums are zero. Boundary removals naturally have an empty left or right side.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The array is unchanged. Total values are bounded by 1000000000, so the parity sums fit int.
