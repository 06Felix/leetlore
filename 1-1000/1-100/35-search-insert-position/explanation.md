## Idea

- Use Arrays.binarySearch and return either the found index or its encoded insertion point, −result−1.

## Why It Works

- The library’s unsuccessful-search result encodes the first position maintaining sorted order. Decoding it gives the required insertion index; distinct values make a successful index unambiguous.

## Edge Cases

- Targets below every value return zero; targets above every value return the array length.

## Complexity

- O(log n) time and O(1) auxiliary space.
