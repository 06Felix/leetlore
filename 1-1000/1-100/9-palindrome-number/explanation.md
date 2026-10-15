# Palindrome Number

## Idea

- Reject negative inputs. Save the original number, reverse its decimal digits by repeatedly extracting x % 10 and dividing x by ten, then compare the reversed value with the original.

## Why It Works

- For a nonnegative value whose reversal fits the accumulator, the loop reconstructs digits in reverse order. Equality is exactly the palindrome condition; negative values fail because their sign cannot appear symmetrically.

## Edge Cases

- Zero returns true without entering the loop. A positive value ending in zero reverses to a shorter value and fails.

## Complexity

- O(d) time and O(1) auxiliary space for d decimal digits; no string conversion is used.

## Notes

- The int accumulator can overflow when reversing a large nonpalindrome, and the code has no overflow guard. Java wraps these intermediate values. Positive palindromes reverse to themselves within range; under the int input bound, an overflowing reversal cannot wrap back to the original: their difference would be one or two multiples of 2^32, whereas reversal preserves the digit sum modulo nine and neither such multiple is divisible by nine.
