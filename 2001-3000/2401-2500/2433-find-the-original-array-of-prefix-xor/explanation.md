# Find The Original Array of Prefix Xor

## Idea

- Set the first output element to pref[0]. For every later index, output pref[i] XOR pref[i - 1].

## Why It Works

- Adjacent prefix XORs contain the same earlier array values, which cancel pairwise. Their XOR therefore leaves exactly arr[i]; this determines every output element uniquely.

## Edge Cases

- A one-element input is copied directly. Equal adjacent prefixes yield a zero original value.

## Complexity

- O(n) time and O(1) working space beyond the O(n) returned array.

## Notes

- The input prefix array is unchanged; a separate output array is allocated.
