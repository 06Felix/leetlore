# XOR Queries of a Subarray

## Idea

- Build a prefix XOR array `xors` where `xors[i + 1]` is the XOR of `arr[0..i]`.
- For each query `[left, right]`, compute the subarray XOR as `xors[left] ^ xors[right + 1]`.
- Store answers in query order.

## Why It Works

- XOR cancels equal values: `a ^ a = 0`.
- `xors[right + 1]` contains the prefix through `right`, and `xors[left]` contains everything before `left`.
- XORing those two prefixes cancels the values before `left`, leaving exactly `arr[left] ^ ... ^ arr[right]`.

## Edge Cases

- Queries starting at index `0` work because `xors[0]` is initialized to `0`.
- Single-element queries return that element since the surrounding prefix values cancel.
- Large query counts are efficient because each query is answered in constant time.

## Complexity

- Time: `O(n + q)`, where `n` is `arr.length` and `q` is `queries.length`.
- Space: `O(n)` for the prefix XOR array, excluding the output.
