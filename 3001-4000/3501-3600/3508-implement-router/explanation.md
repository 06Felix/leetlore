## Idea

- Maintain a FIFO packet deque and a duplicate-key set. For each destination, append timestamps to a sorted history array and advance a start index when its oldest packet is removed. Count active timestamps with lower/upper bounds.

## Why It Works

- Nondecreasing arrival timestamps keep each destination’s history sorted. Global FIFO removal also removes that destination’s earliest active packet, so the start index marks its live suffix. Binary bounds count the inclusive query range. This argument assumes the duplicate keys uniquely represent packets.

## Edge Cases

- Check duplicates before capacity eviction. Forwarding an empty router returns an empty array; removed packets no longer belong to the duplicate set.

## Complexity

- Expected amortized O(1) add/forward time, O(log A) count time, and O(memoryLimit+A) space, where A is all accepted additions retained in timestamp histories.

## Notes

- Correctness risk: the key uses destination shifted by 21 bits, but timestamp can require 30 bits, so fields overlap under XOR. Distinct packets (1,1,1) and (1,3,4194305) produce the same key within the stated bounds and timestamp order; the second can be incorrectly rejected. Timestamp histories also retain removed entries, so storage is not bounded solely by memoryLimit. The solution is unchanged.
