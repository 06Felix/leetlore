# Maximum Odd Binary Number

## Idea

- The solution counts the number of `1` bits and `0` bits.
- To make the binary number odd, one `1` must be placed at the final position.
- To maximize the value, all remaining `1` bits are placed at the front.
- All `0` bits are placed between those leading ones and the final one.

## Why It Works

- An odd binary number must end in `1`.
- Among fixed-length binary strings, earlier `1` bits make the number larger.
- Keeping one `1` for the last position and moving all other ones as far left as possible is therefore optimal.
- The construction uses exactly the original counts of zeros and ones.

## Edge Cases

- If there is only one `1`, the result is all zeros followed by that `1`.
- If there are no zeros, the result is all ones.
- Leading zeros are allowed by the problem.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the output builder.
