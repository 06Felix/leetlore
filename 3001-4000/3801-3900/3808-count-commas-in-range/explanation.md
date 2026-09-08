# Count Commas in Range

## Idea

- A number gets its first comma when it reaches `1,000`.
- It gets a second comma when it reaches `1,000,000`.
- It gets a third comma when it reaches `1,000,000,000`, and so on.
- For every threshold `base`, count how many numbers in `[1, n]` are at least `base`.

## Why It Works

- Each crossed threshold contributes exactly one comma to that number.
- For a fixed threshold `base`, all numbers from `base` through `n` contribute one comma for that threshold.
- That count is `n - base + 1`.
- Summing this over `1000, 1000000, 1000000000, ...` gives the total number of commas.

## Edge Cases

- If `n < 1000`, no number has a comma.
- At `n = 1000`, only `1000` contributes one comma.
- `long` is used for the threshold multiplication to avoid overflow while moving to the next power of `1000`.

## Complexity

- Time: `O(log n)` with base `1000`.
- Space: `O(1)`.

## Tags

- Math
- Counting
- Simulation
