# Explanation

## Idea

- For each number, scan its digits to find the maximum digit and digit count.
- Build the encrypted number by repeating that maximum digit `count` times.
- Add each encrypted value to the answer.

## Why It Works

- `encrypt(x)` replaces every digit with the largest digit originally in `x`.
- The digit scan finds exactly that largest digit and the number of positions to fill.
- Repeating the digit for the original length produces the required encrypted integer.

## Edge Cases

- Single-digit values encrypt to themselves.
- Values like `1000` produce `1111` because the maximum digit is `1`.
- Constraints keep repeated strings short, so parsing back to `int` is safe.

## Complexity

- Time: $O(nd)$, where `d` is the number of digits per value.
- Space: $O(d)$ for the repeated digit string.
