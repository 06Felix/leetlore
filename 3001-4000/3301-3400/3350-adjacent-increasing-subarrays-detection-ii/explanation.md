## Idea

- Measure each maximal strictly increasing run. Update the answer with half its length or the smaller length of it and the previous run.

## Why It Works

- Two adjacent increasing blocks either lie inside one run, supporting floor(runLength/2), or straddle one boundary, supporting min(previousRun,currentRun). Any pair crossing more than one run boundary would put a non-increasing edge inside a block, so these cases are exhaustive.

## Edge Cases

- Equal neighbors break a run. Length-two input always supports k=1; the initial previous count of one cannot inflate that guaranteed lower bound.

## Complexity

- O(n) time and O(n) space for the copied input array.
