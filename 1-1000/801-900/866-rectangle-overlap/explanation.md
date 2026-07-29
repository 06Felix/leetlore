# Rectangle Overlap

## Idea

- Two rectangles do not overlap if one is completely left, right, above, or below the other.
- Return the negation of those separating conditions.
- Edge-touching is treated as non-overlap by using `<=` and `>=`.

## Why It Works

- Axis-aligned rectangles have positive intersection area only when their x-ranges overlap with positive width and y-ranges overlap with positive height.
- The four separation checks cover all ways the intersection can have zero area.
- If none of those separations holds, both dimensions overlap positively.

## Edge Cases

- Rectangles sharing only an edge return `false`.
- Rectangles sharing only a corner return `false`.
- Negative coordinates work because only coordinate ordering is used.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.

## Notes

- The initial equality guard repeats one condition and is redundant; the final separation expression is the part that determines correctness for valid rectangles.
