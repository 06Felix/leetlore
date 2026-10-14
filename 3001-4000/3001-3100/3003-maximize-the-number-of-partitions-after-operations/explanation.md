# Maximize the Number of Partitions After Operations

## Idea

- Scan left to right, recording the current greedy partition mask, repeated-letter mask, and prefix partition count. Scan backward with analogous suffix masks and count completed suffix partitions; use saturation and duplicate tests to estimate the best split around one changed index.

## Why It Works

- A partition ends exactly when adding a new distinct letter exceeds k. The stored masks summarize the partitions meeting at each index. Repeated letters allow changing an occurrence without removing its old letter; when both sides are saturated and a letter is absent from their union, the code allows two extra boundaries, otherwise a repeated saturated suffix allows one. Maximizing these candidates and the unchanged count covers the possible gains.

## Edge Cases

- k = 26 always yields one partition. Without an eligible duplicate, the unchanged partition count remains a candidate.

## Complexity

- O(n) time and O(n) space; masks use a fixed 26-letter alphabet.

## Notes

- The reverse scan tests bitCount computed before any overflow reset. The explanation follows that precise ordering. Bounded differential checks compare the mask logic with every single-character edit on small strings.
