# Minimum Operations to Make Array Sum Divisible by K

## Idea

- Sum nums and return sum % k.

## Why It Works

- Each operation decreases the total by exactly one. The nearest divisible total at or below sum is sum - sum % k, so that remainder is both a necessary number of operations and an achievable one.

## Edge Cases

- An already divisible sum returns zero. If the sum is below k, all of it can be removed to reach zero.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input is unchanged. Its maximum total is 1000000, safely within int range.
