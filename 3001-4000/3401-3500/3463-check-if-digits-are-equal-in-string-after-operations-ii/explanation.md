## Idea
- Express the final two digits as weighted sums with coefficients C(n - 2, i), using adjacent starting positions.
- Compute each coefficient modulo two with a bit test and modulo five by multiplying small binomial coefficients across base-five digits. Search residues zero through nine to combine them modulo ten.

## Why It Works
- Repeated adjacent addition produces Pascal's triangle coefficients, so these weighted sums equal the final digits modulo ten.
- Lucas's theorem supplies the prime-modulus coefficients. Since two and five are coprime, their residue pair uniquely determines the coefficient modulo ten.

## Edge Cases
- Length three uses weights one and one.
- A base-five digit exceeding its corresponding upper digit makes that coefficient zero modulo five; input zeros require no special handling.

## Complexity
- O(n log n) time for base-five coefficient calculations across n positions.
- O(n) auxiliary space for the character copy; the small lookup table and residue search have constant size.
