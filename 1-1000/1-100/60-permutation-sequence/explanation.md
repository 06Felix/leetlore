# Permutation Sequence

## Idea

- Prepare factorials and a sorted list of unused digits. Convert k to zero-based rank; choose the digit at rank / i! for each position, remove it, and continue with rank % i!.

## Why It Works

- Fixing the next digit partitions lexicographic permutations into equal blocks of i! suffix arrangements. The quotient picks the correct block, and the remainder gives the rank within it. Repeating this selection determines the unique kth permutation.

## Edge Cases

- n = 1 works with 0! = 1. The first and final ranks select ascending and descending digits, respectively.

## Complexity

- O(n^2) time because ArrayList removals shift elements, and O(n) auxiliary space.

## Notes

- Since n <= 9, each label is one digit, the concatenated integer fits int, and converting it to a string loses no leading zero. All 5913 ranks through n = 7 matched lexicographic enumeration.
