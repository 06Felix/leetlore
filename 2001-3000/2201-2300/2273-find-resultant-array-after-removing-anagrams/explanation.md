## Idea

- Assign each letter a prime and multiply letter primes modulo 10⁹+7 to form a signature. Keep the first word and each subsequent word whose signature differs from the last retained signature.

## Why It Works

- Anagrams have the same multiplicities and therefore the same prime-product signature. If signatures uniquely distinguished these multiplicities, consecutive equal-signature runs would correctly collapse to their first word. The implementation relies on that uniqueness assumption.

## Edge Cases

- Only adjacent anagram runs are removed; separated matching words can both remain.

## Complexity

- O(total word characters) time and O(max word length) temporary character-array space, plus output.

## Notes

- Correctness risk: reducing prime products modulo 10⁹+7 loses the unique-factorization guarantee. Distinct non-anagram words can collide and be incorrectly removed. No collision-resolution check is present; the stored implementation is unchanged.
