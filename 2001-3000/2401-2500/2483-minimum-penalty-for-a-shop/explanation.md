# Minimum Penalty for a Shop

## Idea

- Scan a running score that adds one for Y and subtracts one for N. Record the closing hour after each strictly larger maximum score.

## Why It Works

- Starting from closing at hour zero, keeping one more hour open removes a penalty for Y or adds one for N. Thus minimizing penalty is equivalent to maximizing this prefix score. Updating only on strict improvement preserves the earliest optimal hour.

## Edge Cases

- Closing before all hours remains a candidate with score zero. All N returns zero; all Y returns the string length.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The variable named profit is the reduction from the hour-zero penalty, not a separate monetary quantity.
