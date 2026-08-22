# Check Divisibility by Digit Sum and Product

## Idea

- Keep a copy of the original number because `n` is consumed while extracting digits.
- For each digit, add it to `sum` and multiply it into `prd`.
- After all digits are processed, check whether the original number is divisible by `sum + prd`.

## Why It Works

- `n % 10` gives the last digit of the current number.
- Dividing by `10` removes that digit, so the loop visits every digit once.
- The problem only asks for divisibility by the digit sum plus digit product, so the final modulo check directly gives the answer.

## Edge Cases

- If any digit is `0`, the product becomes `0`, which is handled naturally.
- Single-digit numbers work the same way: the sum and product are both that digit.
- `n` is positive, so the digit loop always runs at least once.

## Complexity

- Time: `O(d)`, where `d` is the number of digits in `n`.
- Space: `O(1)`

## Tags

- Math
- Simulation
- Digit Manipulation
