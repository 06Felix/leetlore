# Minimum Number of Increments on Subarrays to Form a Target Array

## Idea

- Start with target[0] operations, then add each positive increase target[i] - target[i - 1]. Ignore flat or decreasing transitions.

## Why It Works

- At a rise, at least the height difference in new increment intervals must begin at that index. Existing intervals can continue across equal heights or end at decreases, achieving exactly this lower bound.

## Edge Cases

- A single element needs its value in operations. Nonincreasing arrays need only target[0].

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The input is unchanged; the statement guarantees the accumulated answer fits int.
