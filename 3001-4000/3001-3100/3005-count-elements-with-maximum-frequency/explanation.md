## Idea

- Count values online, tracking the largest frequency and the total occurrences of all values tied at that frequency. Reset the total when a new largest frequency appears, and add the frequency when another value reaches the current maximum.

## Why It Works

- When one count exceeds the old maximum, it is the only value at the new maximum, so the total becomes its count. When a value ties the maximum, its full count joins the total. Counts below the maximum do not affect the answer.

## Edge Cases

- All-distinct values contribute one each. A single most-frequent value contributes its entire count.

## Complexity

- O(n+101) time and O(101) space.
