# Distribute Elements Into Two Arrays I

## Idea

- The Python solution initializes `arr1` with the first number and `arr2` with the second.
- For each later number, it compares the last values of the two arrays.
- If `arr1[-1] < arr2[-1]`, it appends to `arr2`; otherwise it appends to `arr1`.
- The result is `arr1 + arr2`.

## Why It Works

- The problem says to append to `arr1` when `arr1`'s last value is greater than `arr2`'s last value.
- Since the input values are distinct, the last values are not equal in normal operation.
- The code's `x < y` branch appends to `arr2`; the opposite branch appends to `arr1`, matching the required rule.
- Concatenating the arrays at the end matches the requested output format.

## Edge Cases

- The method returns `nums` directly for length at most two, though constraints start at length three.
- Distinct input values avoid equality between the two current last elements.
- `arr2` is never empty after initialization.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the two arrays.
