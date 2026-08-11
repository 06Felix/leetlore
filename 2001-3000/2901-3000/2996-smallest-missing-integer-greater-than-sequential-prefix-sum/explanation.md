# Smallest Missing Integer Greater Than Sequential Prefix Sum

## Idea

First find the longest prefix where every next number increases by exactly `1`.

For that prefix, compute its sum.

Then find the smallest integer greater than or equal to that sum that does not appear in `nums`.

## Approach

The code keeps a `seen` array for values already present in `nums`.

It starts with:

```text
sum = nums[0]
```

because a prefix of length one is always sequential.

Then it keeps extending the prefix while:

```text
nums[i] == nums[i - 1] + 1
```

After the sequential prefix ends, the remaining values are still marked in `seen`, but they are not added to `sum`.

Finally, starting from `sum`, the code moves upward until it finds a value that was not seen.

## Why It Works

The answer must be at least the sum of the longest sequential prefix.

Every value already present in `nums` is not allowed as the answer, so marking all numbers tells us exactly which values to skip.

Checking candidates in increasing order from `sum` gives the smallest valid missing integer.

## Edge Cases

- If the whole array is sequential, the sum includes every element.
- If only `nums[0]` belongs to the sequential prefix, the sum is just `nums[0]`.
- If `sum` itself is missing from `nums`, it is returned immediately.

## Complexity

- Time: `O(n + answer scan)`
- Space: `O(101)`

## Tags

- Array
- Hashing
- Simulation
