## Idea

- Binary-search row ranges using their first and last values. When a row can contain target, call Arrays.binarySearch within it.

## Why It Works

- The strictly separated sorted rows make row ranges ordered and disjoint. Comparing target with a row’s endpoints discards impossible row ranges; the within-row search then determines membership. If a candidate row lacks target, all other rows are also impossible even though the code continues its search.

## Edge Cases

- Single-row and single-column matrices are supported. A value between two rows yields false.

## Complexity

- O(log(rows)+log(columns)) time, equivalent to O(log(rows·columns)), and O(1) auxiliary space.
