# Partition Equal Subset Sum

## Idea
- Reject an odd total sum; otherwise set a single BigInteger bit at the target `sum / 2`.
- For each number, OR the current bitset with a right-shifted copy. Bit zero at the end means the target can be fully consumed.

## Why It Works
- A set bit at position `r` represents a reachable remaining amount after selecting a subset of processed numbers.
- Keeping the original bits skips the current number; shifting right subtracts it from every reachable amount. Both operands use the previous state, so each number is used at most once.
- Reaching zero selects a subset totaling half the sum; its complement has the same sum.

## Edge Cases
- Odd totals cannot split equally; an even total may still lack a reachable half.
- Shifts discard selections that exceed the target. All numbers are positive, so discarded negative remainders can never become useful later.

## Complexity
- Time: $O(n\lceil(T+1)/w\rceil)$ word operations for target $T$ and BigInteger word width $w$.
- Live auxiliary space: $O(\lceil(T+1)/w\rceil)$ words; immutable BigInteger operations allocate intermediate bitsets.
