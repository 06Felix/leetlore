# Restore IP Addresses

## Idea
- Backtrack through the digit string, choosing one to three digits for each of four address parts.
- Reject multi-digit parts beginning with zero and numbers above 255. Save a dotted address only when four parts consume the entire string.

## Why It Works
- Every valid IPv4 address corresponds to exactly one sequence of four segment lengths explored by the search.
- Validation enforces each part's value and formatting restrictions. Early returns on leading zeros or values above 255 are safe because longer segments cannot repair them.
- Requiring both four parts and complete consumption prevents missing digits or extra parts.

## Edge Cases
- `0000` yields `0.0.0.0`; zero cannot begin a longer part.
- Strings shorter than four or longer than twelve digits cannot finish a valid path and yield no answers.

## Complexity
- At most $O(3^4)$ search branches and $O(4)$ path/stack space, both constant for IPv4.
- Result storage is proportional to the returned addresses; each has at most 15 characters.
