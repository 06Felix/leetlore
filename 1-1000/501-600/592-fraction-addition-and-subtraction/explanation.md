# Explanation

## Idea

Split the expression into alternating numerators and denominators, then accumulate one running fraction.

For each fraction `currNum/currDenom`, the code adds it to `num/denom` using a common denominator.

## Why It Works

The sum

`num/denom + currNum/currDenom`

becomes

`(num * currDenom + currNum * denom) / (denom * currDenom)`.

After all fractions are added, dividing numerator and denominator by their greatest common divisor makes the result irreducible.

## Edge Cases

- A leading negative fraction is preserved by the regex split.
- A zero final numerator becomes `0/1` after reduction.
- Denominators stay positive because all input denominators are positive.

## Complexity

Time: `O(L)`, where `L` is the expression length.

Space: `O(L)` for the split tokens.

## Notes

`FindGCD` uses a recursive Euclidean algorithm. The method name is nonstandard Java style, but it does not affect behavior.
