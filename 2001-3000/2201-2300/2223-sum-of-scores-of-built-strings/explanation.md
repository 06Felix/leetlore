# Sum of Scores of Built Strings

## Idea
- Each built string is a suffix of the final string. Its score is that suffix's longest common prefix with the full string.
- Compute these lengths with the Z algorithm, maintaining a matching interval `[l, r)` and reusing earlier Z values inside it. Sum the array as `long` and add `n` for the full string.

## Why It Works
- Inside `[l, r)`, the text matches the prefix, so the mirrored Z value provides a valid match length up to the right boundary.
- Character comparisons then extend the match to its exact length. Updating the interval preserves the invariant for subsequent suffixes.
- Each suffix contributes its Z value exactly once; `z[0]` remains zero, so adding `n` accounts for the full string's score.

## Edge Cases
- A single character scores one. All-equal strings produce $n(n+1)/2$ total score.
- The sum is converted to `long` before accumulation, avoiding overflow at length $10^5$.

## Complexity
- $O(n)$ time: successful extensions beyond the known right boundary advance it at most $n$ times.
- $O(n)$ auxiliary space for the Z array.
