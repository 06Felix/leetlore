# Find All Numbers Disappeared in an Array

## Idea

- Mark every present value in a boolean array indexed from one through n. Scan that range and collect values whose flags remain false.

## Why It Works

- Every input occurrence marks its own value, so after marking a flag is true exactly when that value occurs. Unmarked values are therefore precisely the missing numbers.

## Edge Cases

- Duplicates simply mark the same flag again. If every value appears, the result is empty.

## Complexity

- O(n) time and O(n) auxiliary space beyond the returned list.

## Notes

- This implementation allocates a visited array and does not meet the optional no-extra-space follow-up. It preserves nums rather than marking presence inside the input.
