# Exclusive Time of Functions

## Idea

- Maintain active function IDs on a stack and prevTime as the first unaccounted instant. On a start, charge the running function up to that timestamp, then push the new call. On an end, charge through the inclusive endpoint, pop, and resume accounting at timestamp + 1.

## Why It Works

- Between adjacent log events only the stack-top function executes. Charging each such span exactly once excludes nested-call time from its caller. Treating end timestamps inclusively assigns their final time unit to the ending call rather than its resumed parent.

## Edge Cases

- Recursive calls use separate stack entries even with equal IDs. A call starting and ending at one timestamp receives one unit. Idle spans are ignored when the stack is empty.

## Complexity

- O(total log text length + n) time and O(D + n + L) space for nesting depth D, result length n, and maximum parsed log length L.

## Notes

- The implementation assumes valid, chronologically ordered single-threaded logs. It does not reorder or modify them; bounded timestamps keep the accumulated execution duration within int range.
