# Apple Redistribution into Boxes

## Idea

- Sum all apples, sort capacities, and consume the largest boxes until their total capacity covers the sum.

## Why It Works

- Packs may be split, so only total selected capacity matters. Among any fixed number of boxes, the largest capacities provide the most room; the first sufficient descending prefix therefore uses the fewest boxes.

## Edge Cases

- One large box may suffice. The guarantee of sufficient total capacity prevents exhausting the array before all apples fit.

## Complexity

- O(a + b log b) time and O(log b) sorting stack space for a apple packs and b boxes.

## Notes

- Sorting mutates capacity. The algorithm does not simulate individual apple placement.
