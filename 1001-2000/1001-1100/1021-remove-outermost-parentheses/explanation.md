# Explanation

## Idea
- Track nesting depth while scanning the parentheses.
- For an opening parenthesis, increment depth and retain it only above depth one. For a closing parenthesis, decrement depth and retain it only above depth zero.

## Why It Works
- Each primitive component begins when depth rises from zero to one and ends when it falls from one to zero.
- The tests omit exactly those two outer parentheses and preserve every character nested inside the component, in its original order.

## Edge Cases
- Each `()` component contributes an empty string.
- Deep nesting and multiple primitive components use the same depth counter; validity guarantees it never becomes negative.

## Complexity
- Time: $O(n)$ for the scan and output construction.
- Space: $O(n)$ for `toCharArray`, the builder, and result; the depth counter uses constant space.
