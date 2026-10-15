# Count Partitions with Even Sum Difference

## Idea

- Compute the total as the initial right sum. Move one element at a time into the left sum, testing whether right minus left is even at each nonempty split.

## Why It Works

- At every iteration the two maintained sums match the proposed partition. Testing their difference therefore accepts exactly the required splits. Equivalently, all differences have the same parity as the total because right - left = total - 2 * left.

## Edge Cases

- Only indices before n - 1 are tested, keeping both sides nonempty. Negative even differences also have remainder zero in Java.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The actual code checks each split rather than using the equivalent total-parity shortcut. The input is unchanged.
