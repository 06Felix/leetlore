# Count Number of Nice Subarrays

## Idea

- Use a sliding window with two pointers.
- Track how many odd numbers are currently in the window.
- When the window has exactly `k` odds, move the left pointer while counting how many valid left positions exist.
- Add that count to the answer for each right endpoint.

## Why It Works

- A nice subarray is determined by having exactly `k` odd elements.
- Once the right endpoint is fixed, each removable leading even value gives another valid start.
- `temp` stores the number of valid starts for the current right endpoint and is reused across trailing even values.

## Edge Cases

- Arrays with no possible `k` odds return `0`.
- Even numbers after a valid odd group extend all previously counted starts.
- When a new odd enters, `temp` resets because valid starts must be recomputed.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
