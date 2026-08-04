# Find Missing Elements

## Idea

The smallest and largest numbers from the original range are guaranteed to still be present in `nums`.

So the original range is:

```text
min(nums) ... max(nums)
```

Any number inside this range that is not present in `nums` is missing.

## Approach

The code does two things in one pass:

- marks every number as present in `seen`
- finds the minimum and maximum values

After that, it checks every number strictly between `min` and `max`.

If a number was not marked in `seen`, it belongs in the answer.

Because we scan from `min + 1` to `max - 1`, the result is naturally sorted.

## Why It Works

The endpoints of the original range are still present, so `min` and `max` from the current array are also the endpoints of the original range.

The array has unique values, so a simple present/not-present marker is enough.

Every integer between the endpoints must either be in `nums` or be missing. The second loop adds exactly the missing ones.

## Edge Cases

- If no values are missing, the second loop adds nothing and returns an empty list.
- If `min` and `max` are consecutive, there is no number between them.
- The boolean array works because the values are bounded within `1..100`.

## Complexity

- Time: `O(n + R)`, where `R = max - min`.
- Space: `O(101)`.

## Tags

- Array
- Hashing
- Simulation
