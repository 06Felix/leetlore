# Count Square Sum Triples

## Idea

- Store every square from 1^2 through n^2 in a HashSet. Enumerate ordered pairs of stored squares and count pairs whose sum is also present.

## Why It Works

- Each stored square has one positive root within the allowed range. Membership of a + b therefore certifies exactly one permitted hypotenuse. Ordered pair enumeration correctly counts both leg orders.

## Edge Cases

- Small n may have no triple. No square of zero is stored because all three integers must be positive.

## Complexity

- Expected O(n^2) time and O(n) auxiliary space.

## Notes

- The nested-loop variables are squared leg values, not the original legs. Squares and their sums fit int for n <= 250.
