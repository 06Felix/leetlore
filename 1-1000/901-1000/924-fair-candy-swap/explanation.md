# Fair Candy Swap

## Idea

- Compute Alice and Bob's total candy counts.
- If Alice gives `a` and Bob gives `b`, equality requires `a - b = (aliceSum - bobSum) / 2`.
- Store Alice's box sizes in a set and scan Bob's boxes for a matching Alice box.

## Why It Works

- After swapping, Alice has `aliceSum - a + b` and Bob has `bobSum - b + a`.
- Setting those equal simplifies to `a = b + (aliceSum - bobSum) / 2`.
- The set lookup checks whether that required Alice box exists for each Bob box.

## Edge Cases

- The problem guarantees at least one answer, so the fallback return is unreachable for valid inputs.
- Multiple valid answers are allowed; the first found is returned.
- Different total sums are guaranteed, but the formula handles either sign of the difference.

## Complexity

- Time: `O(a + b)`, where `a` and `b` are the array lengths.
- Space: `O(a)` for Alice's box-size set.
