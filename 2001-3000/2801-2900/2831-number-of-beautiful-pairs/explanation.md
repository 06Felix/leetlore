# Number of Beautiful Pairs

## Idea

- Enumerate all index pairs `(i, j)` with `i < j`.
- Extract the first digit of `nums[i]`.
- Compare it with the last digit of `nums[j]` using gcd.
- Count the pair when the gcd is `1`.

## Why It Works

- The problem's beauty condition depends only on those two digits for each ordered pair.
- Enumerating all pairs checks every possible `i < j` exactly once.
- `gcd(firstDigit, lastDigit) == 1` is exactly the definition of coprime.

## Edge Cases

- Single-digit numbers have the same first and last digit.
- Last digits are never zero under the constraints.
- Digit `1` is coprime with every possible last digit.

## Complexity

- Time: `O(n^2 log 10)`, effectively `O(n^2)`.
- Space: `O(1)`.
