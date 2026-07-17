# Explanation

## Idea

- Scan the attendance string once.
- Count total absences with `cA`.
- Track the current consecutive late streak with `cL`.
- Return `false` as soon as absences reach `2` or late streak reaches `3`.

## Why It Works

- The award rules are local enough to check during a single pass.
- `cA` records whether the total absence limit has been violated.
- `cL` only increases on `L` and resets on any non-`L`, so it always represents the current consecutive late run.
- Early return is safe because once either limit is violated, later characters cannot repair it.

## Edge Cases

- Strings with no `A` or no `L` remain eligible.
- A late streak split by `P` or `A` resets correctly.
- Exactly one absence is allowed; the second absence fails.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
