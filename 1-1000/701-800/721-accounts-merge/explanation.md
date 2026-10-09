## Idea
- Build union-find over email strings, joining consecutive emails within each account.
- Map emails to names, then group every email by its final representative using a TreeSet for deduplication and sorting.
- Prefix each component's sorted email list with its representative's recorded name.

## Why It Works
- Joining adjacent emails connects every email of an account; shared email keys connect accounts transitively.
- Components thus match people identified by email overlap, while equal names alone do not cause a merge. TreeSet supplies unique emails in sorted order.

## Edge Cases
- A one-email account remains a valid component.
- Duplicate email occurrences are deduplicated, and merged accounts share the same name under the statement's guarantee.

## Complexity
- With T email occurrences and U unique emails, O(TU + T log(U + 1)) is a conservative time bound for unbalanced finds and sorted-set inserts, treating bounded-length strings as constant-size.
- O(U) auxiliary space, including recursive find chains, plus the output.

## Notes
- Union uses path compression but no rank or size balancing. Adversarial ordering can create deep parent chains and risk Java stack overflow; the usual balanced-union inverse-Ackermann bound does not apply directly.
