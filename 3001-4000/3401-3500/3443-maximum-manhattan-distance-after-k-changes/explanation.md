## Idea

Evaluate each of the four signed coordinate sums. For every prefix, count helpful and opposing moves; up to min(k, opposing) edits increase its signed distance by two each.

## Why It Works

Manhattan distance is the maximum of x+y, x−y, −x+y, and −x−y. Each move contributes either +1 or −1 to a chosen sum. Replacing an opposing move with a helpful one gains exactly two, so the computed prefix bound is attainable. Maximizing over prefixes and signs gives the answer.

## Edge Cases

With no edits the original path is used. Editing every opposing move reaches the prefix length, which is the maximum possible distance.

## Complexity

O(n) time over four scans and O(n) space for the character array.

## Notes

The edits maximizing different prefixes need not be the same: only one prefix must attain the returned maximum.
