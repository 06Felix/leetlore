# Strong Password Checker

## Idea

- Count missing character categories among lowercase, uppercase, and digit.
- Scan runs of three or more repeated characters to compute needed replacements.
- For long passwords, use deletions first to reduce repeat replacements efficiently.
- Combine length fixes, category fixes, and repeat fixes.

## Why It Works

- For length `6..20`, each replacement can fix one repeat block and possibly one missing category, so the answer is `max(replacements, missing)`.
- For short passwords, insertions can fix both length and missing categories, so the answer is `max(6 - n, missing)`.
- For long passwords, deletions are mandatory and can also reduce replacement needs in repeated runs.
- Runs with lengths modulo `3` equal to `0`, then `1`, then `2` are the best deletion targets for reducing replacements.

## Edge Cases

- Already strong passwords return `0`.
- Very short passwords are governed by length and missing category count.
- Long repeated runs are adjusted before adding the required delete count.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
