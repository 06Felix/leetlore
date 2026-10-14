## Idea

- DP over array index, finalized set-bit count, incoming carry, and chosen sequence positions. Choose cnt copies of the current index, weight by its value power and a binomial placement count, finalize one binary bit, and carry the rest forward.

## Why It Works

- After lower indices are processed, carry+cnt is the current bit-column total. Its parity contributes one finalized bit and its half is the next carry. Choosing cnt of the remaining sequence positions multiplies by C[remaining][cnt], counting every ordered sequence once. At the end, exactly m choices and finalizedBits+popcount(carry)=k enforce magical sequences.

## Edge Cases

- Repeated indices are allowed and produce carries. Zero-count transitions skip an array index; residual carry bits are counted after the final index.

## Complexity

- O(n·k·m³) time and O(n·k·m²) space for the stored four-dimensional DP, with O(m²+nm) preprocessing.

## Notes

- The recurrence matched direct ordered-sequence enumeration on 30 small cases. Products are reduced modulo 10⁹+7 between multiplications.
