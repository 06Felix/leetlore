## Idea

Scan candidate indices i in order while moving a second pointer j forward to the first key occurrence at or after i−k. Include i when that occurrence is at most i+k.

## Why It Works

Any skipped key is too far left for the current index and all later indices. The first remaining key is the closest eligible occurrence on the right; if it lies beyond i+k, every later key does too. Thus the test finds exactly the qualifying indices.

## Edge Cases

Repeated key occurrences do not duplicate output. Once no key remains, no later index can qualify.

## Complexity

O(n) time, O(1) auxiliary space, and O(n) worst-case output space.

## Notes

The output is sorted because i advances monotonically.

