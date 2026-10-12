## Idea

- Try every positive a below n, set b=n−a, and check both numbers digit by digit for zeros.

## Why It Works

- Every positive decomposition is represented by one tested a. The first pair passing both digit checks has the required sum and no zero digits.

## Edge Cases

- Both values stay positive; the statement guarantees a solution, so the empty fallback is not used.

## Complexity

- O(n log n) worst-case time and O(1) auxiliary space.
