# Explanation

## Idea
- Store whether each video has been uploaded in a boolean array.
- After an upload, advance the saved prefix length while the immediately following video is already present.
- `longest()` returns this saved value directly.

## Why It Works
- The saved prefix contains only uploaded videos, and advancing extends it only across consecutive uploaded indices.
- The first missing video stops the loop, so no larger complete prefix exists.
- Uploads never remove videos; the prefix pointer only moves forward and never needs to revisit an earlier index.

## Edge Cases
- Uploading later videos before video one keeps the answer at zero.
- Filling one gap can advance through several previously uploaded videos; the upper-bound check prevents reading beyond `n`.

## Complexity
- Construction: $O(n)$ time and space for the boolean array.
- Upload: $O(n)$ worst case for one call, but $O(u + n)$ total across `u` uploads because the pointer advances at most `n` times.
- `longest()`: $O(1)$ time and auxiliary space.
