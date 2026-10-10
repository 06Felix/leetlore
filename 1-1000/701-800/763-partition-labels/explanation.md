# Partition Labels

## Idea
- Record the final occurrence of every letter, then scan while extending the current partition's right endpoint.
- When the scan reaches that endpoint, emit the partition length and start the next partition.

## Why It Works
- The endpoint includes the last occurrence of every letter encountered in the partition, so closing there cannot leave one of its letters in a later partition.
- Any earlier cut would split an encountered letter's occurrences; the first safe endpoint is therefore the earliest possible cut.
- Taking every earliest safe cut maximizes the number of parts.

## Edge Cases
- A repeated letter can force the entire string into one partition; distinct letters produce partitions of length one.
- New letters encountered before the endpoint can extend it, capturing chains of overlapping occurrences.

## Complexity
- Time: $O(n)$ for two scans.
- Space: $O(n)$ because the implementation copies the string into a character array; the last-occurrence table has 26 entries, plus the returned lengths.
