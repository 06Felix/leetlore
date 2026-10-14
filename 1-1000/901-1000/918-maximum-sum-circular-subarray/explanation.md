## Idea

- Compute total sum, maximum contiguous sum, and minimum contiguous sum in one scan. Compare the ordinary maximum with total−minimum, except return the ordinary maximum if all values are negative.

## Why It Works

- A wrapping subarray is the complement of a nonwrapping excluded interval, so its best sum is total minus the minimum interval. Nonwrapping choices are covered by the ordinary maximum. The all-negative guard prevents choosing an empty complement instead of a required nonempty subarray.

## Edge Cases

- A one-element array works directly. Zero-containing nonnegative maxima are valid, and each element is used at most once.

## Complexity

- O(n) time and O(1) space.
