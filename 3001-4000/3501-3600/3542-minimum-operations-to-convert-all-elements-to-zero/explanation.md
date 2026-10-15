# Minimum Operations to Convert All Elements to Zero

## Idea

- Group positive-value positions and process values in increasing order. A Fenwick tree marks original zeroes and positions of smaller values already removed. Count one operation for each group of equal values not separated by any marked position, then mark all positions of that value.

## Why It Works

- A zero inside a chosen interval prevents a positive minimum from being removed. Smaller values likewise separate groups that cannot share one removal of the larger value: removing them first creates zero barriers, while removing the larger value first cannot cross them. Within a barrier-free group, selecting its span removes all occurrences of the current minimum together.

## Edge Cases

- Original zeroes are barriers from the start. All-zero input needs no operations. The previous position variable tracks the start of the current group; testing from there still detects any intervening barrier.

## Complexity

- O(n log(n + 1) + V) time and O(n + V) space, where V = max(nums). Each positive position has a constant number of Fenwick operations.

## Notes

- The input is unchanged. The grouping logic matched exhaustive optimal-operation search for 1,092 arrays over values 0, 1, and 2 of lengths up to six.
