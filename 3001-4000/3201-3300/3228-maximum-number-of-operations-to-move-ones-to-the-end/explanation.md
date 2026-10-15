# Maximum Number of Operations to Move Ones to the End

## Idea

- Count ones encountered while scanning the string. At the last zero of each maximal zero run, add the number of preceding ones to the answer.

## Why It Works

- Each preceding one can cross a given original zero run at most once. Processing earlier zero runs before later ones lets every such one cross each run separately, attaining the sum of these per-run upper bounds.

## Edge Cases

- Leading zero runs add zero; trailing zeroes count as one run. An already ordered string contributes zero.

## Complexity

- O(n) time and O(n) auxiliary space because the code converts s to a char array.

## Notes

- The original string is unchanged. The operation count fits int for n <= 10^5.
