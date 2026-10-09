## Idea
- Rewrite the good-pair equation as nums[i] - i = nums[j] - j and count occurrences of these keys.
- Each merge returns the updated frequency. Add those frequencies starting from -n, then subtract the resulting good-pair count from n(n - 1) / 2.

## Why It Works
- A group's successive updated frequencies are 1 through its size c. Their sum minus c is c(c - 1) / 2, the number of good pairs in that group.
- Starting the accumulator at -n removes one self-count per element across all groups. Every other pair is bad.

## Edge Cases
- A singleton returns zero; a sequence increasing by one has no bad pairs.
- Distinct transformed keys make every pair bad. Long counters and totals handle more than the int range of pairs.

## Complexity
- O(n) expected time with hash-map updates.
- O(n) worst-case auxiliary space for transformed-key frequencies.
