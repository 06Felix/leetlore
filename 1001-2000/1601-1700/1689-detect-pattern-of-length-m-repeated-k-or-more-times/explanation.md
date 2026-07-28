# Detect Pattern of Length M Repeated K or More Times

## Idea

- Compare each element with the element exactly `m` positions before it.
- A match means the current position continues a repeated block pattern; a mismatch resets the consecutive-match counter.
- Once there are `m * k - m` consecutive offset matches, the array contains `k` adjacent copies of a length-`m` pattern.

## Why It Works

- For a pattern of length `m` to repeat, every element in each later copy must equal the corresponding element in the previous copy, which is exactly `arr[i] == arr[i - m]`.
- `k` copies contain `m * k` elements, and the first copy needs no previous-copy comparison, so the proof needs `m * (k - 1)` successful comparisons.
- Resetting on mismatch prevents non-contiguous or broken repetitions from being counted.

## Edge Cases

- Single-value patterns are handled by the same offset comparison with `m = 1`.
- If the valid repeated segment ends at the last element, the counter reaches the threshold during the final iteration.
- Overlapping but non-consecutive occurrences do not count because mismatches reset `ct`.

## Complexity

- Time: `O(n)`, where `n` is `arr.length`.
- Space: `O(1)`.
