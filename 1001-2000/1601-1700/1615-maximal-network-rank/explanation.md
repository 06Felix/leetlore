## Idea
- Count city degrees and find the two largest degree values, allowing them to be equal.
- If the largest degree belongs to one city, test whether it is connected to every city with the second-largest degree.
- Otherwise, test whether all maximum-degree cities form a clique. Subtract one from the top degree sum exactly when every candidate pair is directly connected.

## Why It Works
- A pair's rank is the sum of its degrees minus one if the pair shares a road. Maximum-degree candidates therefore achieve either the top degree sum or that sum minus one.
- If any candidate pair lacks a connecting road, it achieves the full sum. If all candidates are connected, pairs with a smaller degree sum cannot exceed the candidate sum minus one.
- Counting connecting roads decides which case applies; in the unique-maximum case both endpoint orders are checked.

## Edge Cases
- With no roads the maximum cities are not a clique, and the result is zero.
- A complete graph requires the one-road correction; disconnected pairs can achieve the uncorrected sum.

## Complexity
- O(n + r) time: degrees and the required connecting-road counts use a constant number of scans.
- O(n) auxiliary space, where r is the number of roads.

## Notes
- The edge-count tests rely on the statement's guarantee of at most one road per city pair.
