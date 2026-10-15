# Check If All 1's Are at Least Length K Places Away

## Idea

- Remember the previous one’s index. For every new one, reject if the number of intervening positions, i - prv - 1, is smaller than k.

## Why It Works

- Consecutive ones are the closest relevant pairs. If each consecutive pair has at least k zeroes between them, all more distant pairs satisfy the spacing requirement as well.

## Edge Cases

- No ones or a single one always passes. k = 0 allows adjacent ones.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The sentinel -1 prevents treating positions before the first one as a required gap.
