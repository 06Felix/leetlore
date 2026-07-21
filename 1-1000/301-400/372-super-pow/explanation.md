# Explanation

Problem: [Super Pow](https://leetcode.com/problems/super-pow/)

## Idea

- Keep the answer modulo `1337`.
- Read the exponent digits from left to right.
- When appending digit `d` to the exponent, update:
  `ans = ans^10 * a^d mod 1337`.
- Use fast modular exponentiation for each small power.

## Why It Works

- If the processed prefix represents exponent `p`, after reading digit `d` the new exponent is `10p + d`.
- Therefore `a^(10p+d) = (a^p)^10 * a^d`.
- Since multiplication and exponentiation can be reduced modulo `1337` at every step, the rolling value remains equivalent to the full power modulo `1337`.
- Binary exponentiation computes each required modular power exactly.

## Edge Cases

- Large `a` is reduced inside multiplication by modulo arithmetic.
- Exponent digits are processed without converting the full exponent to an integer.

## Complexity

- Time: $O(n \log 10)$ for `n` exponent digits.
- Space: $O(\log 10)$ recursion depth in `modPow`.

## Notes

- The modulus is stored in the implementation as `kMod = 1337`.
