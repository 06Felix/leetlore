# Task Scheduler II

## Idea

- Process tasks in the required order while tracking the current completion day in `ans`.
- For each task type, store the earliest day it can next be scheduled.
- The current task is done on `max(ans + 1, nextAllowedDay)`.

## Why It Works

- Tasks must be completed in input order, so the only choice is how many break days to insert before the next task.
- If the task type is not cooling down, it can run on the next day after the previous task.
- If it is cooling down, jumping to its stored next allowed day inserts exactly the needed breaks.
- Updating the type to `ans + space + 1` enforces the required gap before its next occurrence.

## Edge Cases

- First occurrences default to day `0`, so they run on the next available day.
- Large schedules use `long` for the day count.
- Consecutive equal task types force jumps by the cooldown rule.

## Complexity

- Time: `O(n)`, where `n` is `tasks.length`.
- Space: `O(u)`, where `u` is the number of distinct task types.
