# Explanation

## Idea

Pair as many `"AA"` and `"BB"` blocks as possible, because alternating them avoids creating `"AAA"` or `"BBB"`.

All `"AB"` blocks can also be used, and if one of `"AA"` or `"BB"` has extras, exactly one extra block from the larger side can be added.

## Why It Works

Each `"AA"` block needs neighboring `"BB"` structure to avoid three consecutive `A`s, and vice versa. Therefore `min(x, y)` pairs from both sides are always usable.

If `x != y`, one extra block from the larger side can be placed at an end without violating the rule, but two extras would force three equal consecutive characters.

`"AB"` blocks are internally alternating and can be included between or around the paired structure.

## Edge Cases

- When `x == y`, no extra same-letter block can be added.
- When one side is larger, exactly one extra contributes.
- The method returns character length, so the number of chosen two-character blocks is multiplied by `2`.

## Complexity

Time: `O(1)`.

Space: `O(1)`.
