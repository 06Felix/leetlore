# Longest Substring of One Repeating Character

## Idea

After every update, we need the longest contiguous block made of the same character.

Recomputing this from scratch after each query would be too slow:

```text
n up to 100000
queries up to 100000
```

So the code uses a segment tree. Each node stores enough information about its range to merge two halves quickly.

## What Each Segment Stores

For every segment, the tree stores:

- `left`: first character in the segment
- `right`: last character in the segment
- `pref`: longest same-character prefix length
- `suff`: longest same-character suffix length
- `best`: longest same-character substring inside the segment
- `len`: segment length

For a single character, all lengths are `1`.

## Merging Two Halves

When combining the left child and right child:

- the new first character comes from the left child
- the new last character comes from the right child
- the best answer is at least the best answer from either child

There is one extra case: a repeating substring may cross the middle.

That happens only when:

```text
right character of left child == left character of right child
```

If so, the crossing length is:

```text
left child's suffix + right child's prefix
```

The parent's `best` is the maximum of all these options.

## Handling Updates

Each query changes one index.

The segment tree updates that leaf, then rebuilds only the nodes on the path back to the root.

After the update, the root's `best` is the answer for the whole string.

## Why It Works

Any longest repeating substring in a segment is either:

- fully inside the left half
- fully inside the right half
- crossing from the left half into the right half

The stored values cover exactly these three cases, so every merge produces the correct answer for its segment.

Since each update changes only one leaf, recomputing the affected path is enough.

## Edge Cases

- If the string has length `1`, every answer is `1`.
- Updating a character to the same value still works because the tree is rebuilt normally.
- Long runs across the middle are handled by the suffix-plus-prefix merge.

## Complexity

- Build: `O(n)`
- Each update: `O(log n)`
- Total time: `O(n + k log n)`
- Space: `O(n)`

## Tags

- Segment Tree
- String
- Design
- Range Query
