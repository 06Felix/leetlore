## Idea

- Represent each person’s languages with a BitSet. Collect both endpoints of friendships with no common language, then choose the language already known by the most people in this set.

## Why It Works

- Already communicating friends need no teaching. For any broken friendship, both endpoints must know the selected language afterward. Thus every affected person lacking that language must be taught, and affectedCount−largestKnownCount minimizes the required teaching.

## Edge Cases

- Deduplicate affected users across friendships. If there are no broken friendships, return zero.

## Complexity

- O(L+F·ceil(n/64)+A·n) time and O(m·ceil(n/64)+m+n) space, where L is listed language entries, F friendships, and A affected users.

## Notes

- BitSet clone and intersection test shared languages for each friendship.
