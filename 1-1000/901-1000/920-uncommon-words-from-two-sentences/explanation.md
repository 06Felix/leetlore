# Uncommon Words from Two Sentences

## Idea

- Split both sentences by spaces.
- Count every word across both sentences in one hash map.
- Return the words whose total count is exactly `1`.

## Why It Works

- A word is uncommon exactly when it appears once overall across the two sentences.
- Counting both sentences in the same map captures duplicates within one sentence and overlaps between sentences.
- Filtering count `1` keeps only words that appear in one sentence and not the other.

## Edge Cases

- A repeated word in one sentence is not returned because its count exceeds `1`.
- A word appearing once in each sentence is not returned because its total count is `2`.
- Output order is arbitrary, which the problem allows.

## Complexity

- Time: `O(w)`, where `w` is the total number of words.
- Space: `O(u)`, where `u` is the number of distinct words.
