# Explanation

## Idea

- Sort the array.
- The best product is either the three largest numbers or the largest number with the two smallest numbers.
- Return the larger of those two products.

## Why It Works

- After sorting, the largest positive product from three high values is at the end of the array.
- Two very negative numbers can multiply into a large positive value, so they must be considered with the largest number.
- No other triple can beat one of these two sorted extremes.

## Edge Cases

- All negative arrays work because the three largest values give the least negative product.
- Arrays with zeroes are handled by normal multiplication.
- Length exactly `3` compares the same triple against itself or equivalent extremes.

## Complexity

- Time: $O(n \log n)$.
- Space: $O(1)$ extra beyond sorting implementation.
