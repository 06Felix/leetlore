# Maximize Active Sections After Trade II

## Intuition

The trade looks confusing at first because we first turn some `1`s into `0`s, and then turn some `0`s into `1`s.

But if we look at the shape of a valid trade, it becomes much simpler.

To choose a block of `1`s, that block must have `0`s on both sides:

```text
000 111 00
```

If we turn the middle `111` into zeroes, the whole area becomes one big zero block:

```text
00000000
```

Then we turn that zero block into ones.

The middle `111` was already active before the trade, so it does not add anything new. The actual gain comes only from the zeroes on the left and right.

So for every pattern:

```text
0-block + 1-block + 0-block
```

the gain is:

```text
left zero block length + right zero block length
```

Now each query is asking: inside this range, what is the best such gain?

## Important Detail

The query tells us where the trade is allowed to happen, but the final answer counts active sections in the whole string.

So we start with:

```text
total = number of '1' characters in the original string
```

For each query, we only add the extra gain found inside that query:

```text
answer = total + best gain inside query
```

This is why for:

```text
s = "0100"
query = [2, 3]
```

the substring is `"00"`, so no trade helps there. But the original string still has one `1`, so the answer is `1`, not `0`.

## Compressing the String

Instead of checking every character for every query, we compress the string into blocks of equal characters.

Example:

```text
s = 001110011

blocks:
0 -> 00
1 -> 111
2 -> 00
3 -> 11
```

The code stores useful information for each block:

- where the block starts
- where the block ends
- how long it is
- whether it is a `1` block
- which block each string index belongs to

This is the key optimization. Once we know the block of `l` and the block of `r`, we can reason in blocks instead of characters.

## Precomputing Gains

For a full pattern:

```text
zero block, one block, zero block
```

the first zero block is at index `i`, the one block is at `i + 1`, and the right zero block is at `i + 2`.

So the gain for this pattern is:

```text
len[i] + len[i + 2]
```

The code stores this in `val[i]`.

Only zero blocks can start such a pattern, so `val[i]` is filled only when block `i` is a zero block.

## Answering a Query

For a query `[left, right]`:

```text
first = block[left]
last  = block[right]
```

There are two types of useful patterns.

First, patterns completely inside the query. These are easy because all involved blocks are fully included.

Second, patterns touching the query boundary. These need special handling because the first or last block may only be partially inside the query.

Example:

```text
s      = 00011100
query  =   [1, 7]
inside =  0011100
```

The left zero block contributes only `"00"`, not the full `"000"`.

That is why the code separately checks:

- a pattern starting from the first block
- a pattern ending at the last block
- patterns fully inside the middle

## Why Sparse Table Is Used

A query can cover many blocks. We need the maximum `val[i]` among all fully internal patterns.

Doing a scan for every query can become too slow:

```text
n up to 100000
queries up to 100000
```

So the code builds a sparse table over `val`.

After that, finding the maximum gain in any range of blocks takes `O(1)`.

This is what makes the solution fast enough for LeetCode.

## Complexity

Let `R` be the number of compressed blocks.

- Build blocks: `O(n)`
- Build sparse table: `O(R log R)`
- Each query: `O(1)`
- Total: `O(n + R log R + q)`
- Space: `O(n + R log R)`

Since `R <= n`, this fits comfortably within the constraints.

## Tags

- String
- Binary String
- Run Length Encoding
- Range Maximum Query
- Sparse Table
- Precomputation
- Greedy
