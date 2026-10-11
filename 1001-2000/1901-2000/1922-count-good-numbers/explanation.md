# Count Good Numbers

## Idea
- Each pair of positions has five even-digit choices and four prime-digit choices, giving 20 possibilities.
- Compute $20^{\lfloor n/2\rfloor}$ modulo $10^9+7$ using recursive exponentiation by squaring, multiplying by five for an unmatched even position.

## Why It Works
- Position choices are independent, and leading zeros are explicitly allowed.
- An even exponent is handled by squaring the base and halving the exponent; an odd exponent removes one factor before halving on the next recursive step.

## Edge Cases
- Length one returns five; odd lengths have one extra even-indexed position.
- The exponent remains `long` for lengths up to $10^{15}$, and reduced modular products fit `long`.

## Complexity
- Time: $O(\log n)$ modular multiplications.
- Space: $O(\log n)$ recursive stack depth.
