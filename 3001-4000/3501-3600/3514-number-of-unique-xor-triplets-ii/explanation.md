# Number of Unique XOR Triplets II

## Idea

We need all different values of:

```text
nums[i] XOR nums[j] XOR nums[k]
```

where `i <= j <= k`.

The order of the three chosen numbers does not matter for XOR. If we pick any three indices, we can always arrange them in sorted order, so the condition `i <= j <= k` does not remove any XOR value.

Also, the same index can be used more than once. That means if a value exists in `nums`, we are allowed to use it as the first, second, or third value.

So the task becomes:

```text
Find all values a XOR b XOR c
where a, b, c are values present in nums.
```

## Why a Boolean Array Is Enough

Every `nums[i]` is at most `1500`.

The next power of two is `2048`, so every XOR result is between:

```text
0 and 2047
```

Because of that, we do not need a hash set. A boolean array of size `2048` can directly mark whether a XOR value exists.

## Step 1: Mark Existing Numbers

The first array is:

```text
have[x] = true if x appears in nums
```

Duplicates do not matter here. We only care whether a value is available at least once, because repeated indices are allowed.

## Step 2: Build All Two-Number XOR Values

Before handling triplets, build every possible value of:

```text
a XOR b
```

where both `a` and `b` are present in `nums`.

The code stores this in:

```text
pair[x] = true
```

This means `x` can be made using two chosen numbers.

## Step 3: Add the Third Number

Now for every possible two-number XOR value, XOR it with every number in `nums`.

```text
(a XOR b) XOR c
```

Each result is marked in:

```text
seen[x] = true
```

At the end, the answer is simply the number of `true` values in `seen`.

## Example

For:

```text
nums = [1, 2]
```

Possible two-number XOR values include:

```text
1 XOR 1 = 0
1 XOR 2 = 3
2 XOR 2 = 0
```

Then adding the third value gives results like:

```text
0 XOR 1 = 1
0 XOR 2 = 2
3 XOR 1 = 2
3 XOR 2 = 1
```

So the unique triplet XOR values are:

```text
1, 2
```

## Complexity

The XOR universe size is fixed at `2048`.

- Building present values: `O(n)`
- Building pair XOR values: `O(2048 * 2048)`
- Building triplet XOR values: `O(2048 * n)`
- Space: `O(2048)`

This is fast enough because `n <= 1500`.

## Tags

- Bit Manipulation
- XOR
- Boolean Array
- Hashing
- Dynamic Programming
- Enumeration
