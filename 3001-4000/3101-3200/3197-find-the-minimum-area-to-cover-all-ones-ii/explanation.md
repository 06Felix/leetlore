## Idea

- Enumerate six partition shapes: three horizontal strips, three vertical strips, and four orientations of a split where one side is divided again. For each region, sum its ones’ bounding-box area.

## Why It Works

- Three disjoint axis-aligned rectangles can be separated by these strip or two-stage cut arrangements. For fixed cuts, each occupied region’s bounding box minimizes its covering area, and the boxes remain disjoint because the regions are disjoint. Taking the minimum over all cuts covers an optimal arrangement.

## Edge Cases

- Single-row grids use vertical strips; single-column grids use horizontal strips. Regions with no ones contribute zero in the helper.

## Complexity

- O(rows·columns·(rows²+columns²+rows·columns)) time and O(1) auxiliary space.

## Notes

- The helper assigns zero area to empty regions, although the problem requires three nonzero rectangles. With at least three ones, any candidate using fewer occupied boxes can be split into three nonempty boxes without increasing total area; this reconciles the relaxed empty-region calculation with the required answer.
