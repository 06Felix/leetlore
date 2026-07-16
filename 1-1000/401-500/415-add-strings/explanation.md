# Add Strings

## Idea

- The implementation adds digits from right to left, like manual addition.
- `cry` stores the carry and the current digit sum.
- It appends each result digit to a `StringBuilder` in reverse order.
- The builder is reversed at the end.

## Why It Works

- Addition of each decimal column depends only on the two current digits and the carry from the previous column.
- Processing from the least significant digit makes that carry available immediately.
- The loop continues while either string has digits left or a carry remains.
- Reversing gives the normal most-significant-first result.

## Edge Cases

- Different length strings are handled by checking each index independently.
- A final carry appends an extra digit.
- `"0" + "0"` produces `"0"`.

## Complexity

- Time: $O(\max(m, n))$.
- Space: $O(\max(m, n))$ for the output.
