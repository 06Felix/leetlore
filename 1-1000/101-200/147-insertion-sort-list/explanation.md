# Insertion Sort List

## Idea

- Maintain a sorted list behind a dummy head and a predecessor cursor. Save each next input node, restart the cursor at the dummy when its current value is too large, walk to the insertion point, and splice the current node into the sorted list.

## Why It Works

- Before each insertion, the output chain is sorted. The cursor either starts at the dummy or at a node strictly smaller than the new value; advancing while the next value is smaller locates a valid predecessor. Splicing there preserves sorted order while consuming one input node.

## Edge Cases

- Negative values restart from the dummy when needed. Equal values are inserted before existing equal successors, so stability is not guaranteed or required.

## Complexity

- O(n^2) worst-case time and O(1) auxiliary space. Reusing the cursor reduces rescanning on favorable inputs.

## Notes

- The original nodes are relinked; only one dummy node is allocated. Actual Java matched reference sorting on 1000 random lists and produced no extra nodes or cycles.
