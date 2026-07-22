# Maximize Active Sections After Trade

## Idea

- Count the active sections already present in `s`.
- A valid first step must use an internal `1`-run with a `0`-run on both sides, which is a `0-run → 1-run → 0-run` pattern.
- Replacing the middle `1`-run with `0`s merges the three runs; converting that merged zero block to `1`s gains exactly the lengths of the two neighboring zero-runs.
- Scan the runs once and keep the largest neighboring-zero sum.

## Why It Works

- The augmented `1`s make `1`-runs touching either end of `s` invalid as the first trade block.
- For an internal `1`-run, the original ones are lost and then restored when the merged zero block is activated.
- Therefore, only the neighboring zero sections contribute a net gain, and choosing the maximum such gain is optimal.
- Consecutive candidate patterns may share a zero-run, so the scan retains the previous zero-run length while processing each one-run.

## Edge Cases

- Strings with no internal `1`-run surrounded by zeroes cannot improve, so the original active count is returned.
- All-zero and all-one strings require no trade.
- A candidate touching the beginning or end is rejected because the augmented boundary is `1`, not `0`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
