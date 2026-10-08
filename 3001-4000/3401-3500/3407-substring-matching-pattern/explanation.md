# Explanation

## Idea
- Split the pattern into the literal portions before and after its sole asterisk.
- Find the earliest occurrence of the left portion, then search for the right portion starting immediately after that occurrence ends.

## Why It Works
- A match requires the literal portions in order without overlap; any intervening characters can be supplied by the asterisk.
- Choosing the earliest left occurrence leaves at least as much remaining text as any later choice. If its remaining suffix cannot contain the right portion, no later left occurrence can succeed.

## Edge Cases
- An empty left or right portion is handled by `indexOf` on the empty string.
- The asterisk may match zero characters; pattern `*` can always match within the nonempty input.

## Complexity
- Time: $O(|s|\,|p| + |p|)$ as a conservative bound for the literal searches and pattern splitting.
- Auxiliary space: $O(|p|)$ for the two pattern substrings.
