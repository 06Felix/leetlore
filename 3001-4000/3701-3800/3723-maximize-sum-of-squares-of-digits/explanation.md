# 3723. Maximize Sum of Squares of Digits

## Idea

- A digit contributes its square, so keeping more of the sum inside one large digit is always better than spreading it across smaller digits.
- Fill the number with as many `9`s as possible, then use one digit for the remainder. The unused positions become `0`s.
- The score only depends on the chosen digits. Putting them in descending order makes the resulting number as large as possible among all maximum-score choices.

## Why This Works

- Suppose two digits are `a` and `b`, where `a < b < 9`. Moving one unit from `a` to `b` changes the score by `(a - 1)^2 + (b + 1)^2 - a^2 - b^2`, which is positive.
- Therefore, whenever possible, moving value toward the larger digit improves the score. Repeating that move leaves every digit at an extreme: `9`, one possible remainder, or `0`.
- A valid number exists exactly when `sum <= 9 * num`. Since `sum` is positive, the constructed number always has a non-zero leading digit.

## Edge Cases

- If the digit sum is greater than `9 * num`, no `num`-digit number can have that sum, so return an empty string.
- When the sum is a multiple of `9`, there is no remainder digit.
- Remaining positions are filled with zeroes without changing the score or digit sum.

## Complexity

- Time: `O(num)`
- Space: `O(num)` for the returned string

## Tags

- Greedy
- Math
- String
