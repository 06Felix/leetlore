## Idea

- Maintain the smallest possible ending value for increasing subsequences of every length. Append a value larger than the final tail; otherwise replace its equal-position or insertion-position tail found by binary search.

## Why It Works

- A smaller tail preserves at least as many future extension possibilities as a larger tail of the same length. Replacing a tail cannot reduce achievable lengths, while extending the last tail proves one longer subsequence exists. The tail count therefore equals the LIS length.

## Edge Cases

- Equal values replace rather than extend, enforcing strict increase. A nonempty constant array returns one.

## Complexity

- O(n log n) time and O(n) space.

## Notes

- The tails list is a summary of lengths, not necessarily one actual subsequence.
