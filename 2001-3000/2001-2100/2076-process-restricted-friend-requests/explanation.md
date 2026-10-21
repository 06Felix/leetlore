# Process Restricted Friend Requests

## Idea
- Keep current friendship components in a DSU with union by size and path compression.
- Before joining two different components, scan all restrictions. Reject the request if a restricted pair currently has one endpoint in each component; otherwise union them.

## Why It Works
- Accepted friendships make everyone in a connected component indirect friends, so only component membership matters.
- Joining two components creates exactly the cross-component connections. A restriction becomes violated precisely when its endpoints occupy the two components being merged.
- Previously valid components remain valid after an approved merge. A request within one component adds no new connectivity and is accepted immediately.

## Edge Cases
- Duplicate requests and already-indirect friends succeed without rechecking restrictions.
- Empty restrictions permit all requests; a rejected request leaves the component partition unchanged.

## Complexity
- $O(n+Q(R+1)\alpha(n))$ amortized time for $Q$ requests and $R$ restrictions.
- $O(n)$ auxiliary space for DSU, plus $O(Q)$ output space; restrictions and requests are unchanged.
