## Idea
- Maintain incoming trust minus outgoing trust for each person: decrement the truster and increment the trusted person for every pair.
- Return a person whose score equals n - 1; otherwise return -1.

## Why It Works
- With unique trust pairs and no self-trust, incoming trust is at most n - 1 and outgoing trust is nonnegative.
- A score of n - 1 thus requires all other people to trust this person and requires this person to trust nobody: exactly the judge's conditions.

## Edge Cases
- With n = 1 and no trust pairs, person one is the judge.
- Receiving everyone's trust is insufficient if the candidate trusts someone else; empty trust with n greater than one returns -1.

## Complexity
- O(n + t) time, where t is the number of trust pairs.
- O(n) auxiliary space for scores.
