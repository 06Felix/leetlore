# Explanation

## Idea
- Concatenate each string array in order with an empty separator using `String.join`.
- Compare the two resulting strings with `equals`.

## Why It Works
- An empty separator preserves precisely the sequence of characters represented by each array.
- String equality compares those sequences, independently of where the original array split its words.

## Edge Cases
- Different word boundaries can still represent identical strings.
- Different total lengths or any mismatching character cause equality to return false.

## Complexity
- Time: $O(L_1 + L_2)$ for total character counts `L1` and `L2`.
- Auxiliary space: $O(L_1 + L_2)$ for the concatenated strings.
