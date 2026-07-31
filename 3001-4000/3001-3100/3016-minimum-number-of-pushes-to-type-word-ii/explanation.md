# Minimum Number of Pushes to Type Word II

## Idea

There are 8 usable keys: `2` to `9`.

Each key can hold many letters:

- the first letter on a key costs `1` push
- the second letter on a key costs `2` pushes
- the third letter on a key costs `3` pushes
- and so on

So across all keys:

- at most 8 letters can have cost `1`
- at most 8 more letters can have cost `2`
- at most 8 more letters can have cost `3`
- the remaining letters have cost `4`

To minimize the total pushes, the letters used most often should get the cheapest costs.

## Approach

First count how many times each character appears.

Then sort the 26 counts.

After sorting, the largest counts are at the end of the array. The code reads them from largest to smallest:

```text
ct[25], ct[24], ct[23], ...
```

For the `i-th` largest frequency:

```text
cost = i / 8 + 1
```

That gives:

```text
i = 0..7    -> cost 1
i = 8..15   -> cost 2
i = 16..23  -> cost 3
i = 24..25  -> cost 4
```

Then add:

```text
frequency * cost
```

to the answer.

## Why It Works

Suppose a frequent letter is assigned a higher push cost than a less frequent letter.

Swapping their positions would reduce or keep the total cost, because the larger frequency should always be multiplied by the smaller cost.

So the optimal strategy is greedy:

```text
largest frequencies get the cheapest keypad positions
```

Sorting the frequencies and assigning costs in groups of 8 follows exactly that rule.

## Edge Cases

- Letters not present have frequency `0` and are ignored.
- If the word has at most 8 distinct letters, every used letter costs only `1` push.
- Since there are only 26 lowercase letters, the maximum possible push cost is `4`.

## Complexity

- Time: `O(n + 26 log 26)`
- Space: `O(26)`

## Tags

- String
- Greedy
- Sorting
- Counting
