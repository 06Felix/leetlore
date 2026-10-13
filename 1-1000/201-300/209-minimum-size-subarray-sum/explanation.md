## Idea

- Expand a positive-number window until its sum reaches target. Then remove from the left until the sum drops below target and record the length just before that last removal.

## Why It Works

- Positive values make shrinking decrease the sum monotonically. The last valid window for each right endpoint is its shortest valid window; the stored expression r−l+2 recovers that window after l has advanced once beyond it. Taking the minimum covers the global optimum.

## Edge Cases

- No valid window returns zero. A single value reaching target gives length one; the maximum possible total fits int.

## Complexity

- O(n) time and O(1) auxiliary space.
