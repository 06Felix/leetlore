# Self Dividing Numbers

## Idea

- Test every integer in the interval. Extract its digits from a temporary copy and reject immediately if a digit is zero or does not divide the original number. Append passing numbers.

## Why It Works

- Every required digit is inspected exactly once against the unchanged candidate. Passing all digit checks is precisely the self-dividing condition; increasing enumeration produces the requested ascending list.

## Edge Cases

- Any zero digit rejects before division by zero. Positive single-digit numbers all pass.

## Complexity

- O((right - left + 1) * log(right + 1)) time and O(1) working space beyond the output.

## Notes

- ans is an instance field and is never cleared. Reusing the same Solution instance appends to old results and can return an incorrect list; a fresh instance avoids this risk.
