# Design Twitter

## Idea

- Keep a newest-first linked tweet list for each user and a followee set that includes the user themself. Build a max-heap from followed users’ list heads, then repeatedly emit the newest tweet and insert its next older tweet, stopping after ten.

## Why It Works

- Each user list is timestamp-sorted. The heap always contains the newest remaining candidate from each source, so popping and advancing that source performs a correct descending multiway merge. Follow sets determine exactly the eligible sources.

## Edge Cases

- Unknown users have an empty feed. Self-follow is maintained internally and protected from unfollow. Users with no tweets add no heap entry.

## Complexity

- Expected O(1) post/follow/unfollow. Feed construction takes O(F log(F + 1)) plus O(10 log(F + 1)) merge work for F followed users; feed workspace is O(F). Persistent storage is O(tweets + follow links + users).

## Notes

- All posts are retained. Timestamps and comparator subtraction remain safe under the 30000-call bound. User creation ensures followed IDs exist before feed lookup.
