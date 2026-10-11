# Total Characters in String After Transformations II

## Idea
- Build a 26-by-26 matrix whose source-letter row describes the letters produced in one transformation, including wraparound.
- Raise that matrix to power `t` by recursive exponentiation by squaring, then multiply the starting frequency row vector by the powered matrix and sum its entries.

## Why It Works
- One matrix multiplication aggregates every source letter's contributions to each destination letter.
- Multiplying transition matrices composes transformations, so the powered matrix describes exactly `t` rounds.
- Identity handles zero powers, odd powers remove one factor, and even powers square the matrix and halve the exponent. All arithmetic is reduced modulo $10^9+7$.

## Edge Cases
- Alphabet wraparound is encoded by remainder 26; repeated sources contribute independently to the final frequencies.
- `long` multiplication prevents overflow before modular reduction, while large transformation counts require only logarithmically many matrix products.

## Complexity
- Time: $O(|s|+26^3\log(t+1))$, including matrix exponentiation.
- Space: $O(|s|+26^2\log(t+1))$ for the copied input characters, matrices retained by recursive frames, and the recursion stack.
