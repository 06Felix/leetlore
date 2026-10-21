# Largest Component Size by Common Factor

## Idea
- Factor each number into distinct prime factors by trial division, removing all repetitions of each factor before continuing.
- Remember the first index using each factor. Union every later index sharing that factor with the remembered index, then return the largest DSU component size.

## Why It Works
- Two values share a factor greater than one exactly when they share a prime factor, so each union joins genuinely adjacent graph nodes.
- Linking all indices for a prime to one representative connects that entire group. DSU transitivity then captures paths through different shared primes.
- No union can connect unrelated components, so the final sizes equal the graph's connected-component sizes.

## Edge Cases
- Value `1` has no prime factors and remains a singleton.
- Repeated prime powers create only one factor-map action; a remaining value above one after trial division is prime.

## Complexity
- A conservative bound is $O(n\sqrt M+n\log M\,\alpha(n))$ time, where $M=\max(nums)$ and DSU uses path compression and union by size.
- $O(n+P)$ auxiliary space, where $P$ is the number of distinct prime factors stored across the input.
