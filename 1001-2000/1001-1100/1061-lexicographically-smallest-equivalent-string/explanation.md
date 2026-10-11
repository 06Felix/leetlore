# Lexicographically Smallest Equivalent String

## Idea
- Union the 26 letters paired by `s1` and `s2`, always attaching the larger representative to the smaller one.
- Replace each base-string character with its component representative, using path compression during lookup.

## Why It Works
- Union-find computes the reflexive, symmetric, and transitive closure of the supplied equivalences.
- Choosing the smaller root on every merge keeps the minimum letter as each component's representative.
- Each position can independently choose its smallest equivalent letter, yielding the lexicographically smallest complete string.

## Edge Cases
- Unrelated letters stay unchanged; repeated pairs and self-equivalences are harmless.
- Chains of equivalences are collapsed by root lookup rather than using only direct pairs.

## Complexity
- Time: $O(|s1|+|baseStr|)$ with a fixed 26-letter universe.
- Space: $O(|baseStr|+26)$ for output, the copied base-string characters, and union-find storage.
