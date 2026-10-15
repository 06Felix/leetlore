# Smallest Integer Divisible by K

## Idea

- Reject k divisible by two or five. Otherwise build repunit remainders with rem = (rem * 10 + 1) % k for lengths one through k, returning the first zero.

## Why It Works

- Appending digit one gives the stated remainder recurrence. For k coprime to ten, among the first k repunits either a remainder is zero or two nonzero remainders repeat. Subtracting the corresponding repunits gives a shorter repunit times a power of ten, so a divisible repunit must exist within the tested lengths.

## Edge Cases

- k = 1 returns one. A divisor containing factor two or five cannot divide a number ending in one.

## Complexity

- O(k) time and O(1) auxiliary space.

## Notes

- Only remainders are stored, so no arbitrarily large integer is constructed. rem * 10 + 1 fits int under k <= 100000.
