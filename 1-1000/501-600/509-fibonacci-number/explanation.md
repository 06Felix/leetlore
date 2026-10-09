## Idea
- Evaluate a floating-point expression resembling Binet's formula using the constants 1 + sqrt(5), sqrt(5) - 1, and sqrt(5).
- Divide the difference of powers by 2^n × sqrt(5), take the ceiling, and cast to int.

## Why It Works
- For even n, the exact expression equals F(n). For odd n, it is slightly below F(n), by 2 × ((sqrt(5) - 1) / 2)^n / sqrt(5), which is less than one; ceiling then gives F(n).
- n = 0 gives zero directly. The shift 1 << n remains positive under n <= 30.

## Edge Cases
- Zero and one produce the defined base values.
- The largest allowed result, F(30), fits int.

## Complexity
- O(1) time using a fixed number of primitive math operations under the bounded input range.
- O(1) auxiliary space.

## Notes
- This relies on approximate constants and floating-point rounding. In particular, exact even-n results can be sensitive to rounding before ceil; it is less robust than the integer recurrence and should not be generalized beyond the stated bounds.
- A Python floating-point check matched the integer recurrence for n = 0 through 30; that check is not proof of identical Java Math.pow rounding.
