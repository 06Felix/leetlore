## Idea

- Backtrack through digits, appending each mapped letter, recurring to the next digit, and deleting that appended letter before trying the next choice.

## Why It Works

- Every combination selects exactly one letter from each digit’s mapping. The recursion enumerates this Cartesian product once, and backtracking restores the prefix for the next independent branch.

## Edge Cases

- Digits seven and nine have four choices, others three. Blank input returns the current result list.

## Complexity

- O(L·4^L) worst-case time/output space and O(L) auxiliary recursion/builder space for L digits.

## Notes

- State reuse risk: the instance result list is not cleared in letterCombinations. Repeated calls on the same object accumulate older combinations, including when blank input is passed.
