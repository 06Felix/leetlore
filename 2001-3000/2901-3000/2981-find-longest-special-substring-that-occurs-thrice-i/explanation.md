# Explanation

## Idea
- Test a candidate substring length by tracking each current same-letter run and counting one occurrence for every run position long enough to end that substring.
- Count separately by letter and succeed once a letter has three occurrences, including overlaps.
- Reject if length one fails; otherwise binary-search the greatest feasible length below the infeasible full-string length.

## Why It Works
- A run of length `R` contributes $\max(0,R-x+1)$ occurrences of the length-`x` repeated-letter substring, exactly what the scan counts.
- Shortening a feasible repeated-letter substring cannot reduce its occurrence count, so feasibility is monotonic.

## Edge Cases
- Three overlapping occurrences within one run qualify, as in `aaaa` with length two.
- Counts combine separated runs of the same letter; if no letter appears three times, return `-1`.

## Complexity
- Time: $O(n \log n)$; the helper's run-start pointer only moves forward, making each test linear.
- Auxiliary space: $O(26) = O(1)$.
