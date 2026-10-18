# Four Divisors

## Idea

- Search divisors from two through the square root. Keep the first divisor; if another appears, reject the number. Add 1, num, div, and num/div only when the retained divisor is not the square root.

## Why It Works

- Divisors occur in complementary pairs. Exactly one proper divisor below the square root and a distinct complement give exactly four divisors. A square-root divisor instead yields an odd divisor count, while a second discovered divisor proves there are too many.

## Edge Cases

- Primes and one have no retained divisor. Prime squares are rejected; prime cubes such as eight are accepted. Duplicate input numbers contribute independently.

## Complexity

- O(n sqrt(V)) worst-case time and O(1) auxiliary space for n entries and maximum value V.

## Notes

- The loop can terminate early once two divisors are found. The stated bounds keep the accumulated answer within int range.
