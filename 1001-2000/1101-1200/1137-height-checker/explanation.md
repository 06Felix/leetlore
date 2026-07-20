# Height Checker

## Idea

- Clone `heights` into `std`.
- Sort `std` to get the expected non-decreasing order.
- Compare each index in the original and sorted arrays.
- Count positions where the values differ.

## Why It Works

- Sorting the heights gives the exact order students should stand in.
- A mismatch at index `i` means the current student height differs from the expected height there.
- Counting all mismatches directly matches the requested answer.

## Edge Cases

- Already sorted input returns `0`.
- Duplicate heights are handled naturally by sorting.
- A completely reversed or shifted order may count every index.

## Complexity

- Time: $O(n \log n)$ from sorting.
- Space: $O(n)$ for the cloned array.
