# Number of Ways to Divide a Long Corridor

## Idea

- Pair seats in their original order. Whenever the first seat of a new pair is encountered, multiply the answer by its index minus the previous pair’s last-seat index. Reject zero seats or an odd total.

## Why It Works

- Every section must contain the next two seats, so pairing is forced. Between one pair’s second seat and the next pair’s first seat, any gap is a legal divider location. These choices are independent, giving the product of gap counts.

## Edge Cases

- Exactly two seats give one arrangement regardless of leading or trailing plants. Odd or zero seat counts give zero.

## Complexity

- O(n) time and O(n) auxiliary space because the implementation copies the corridor to a char array.

## Notes

- Products use long and are reduced modulo 1000000007. Leading and trailing plants introduce no extra divider choices.
