## Idea

- Walk the reverse-digit lists together, adding the current digits and carry. Append sum modulo ten to a new result list and carry sum divided by ten forward.

## Why It Works

- Reverse digit order presents least significant places first. Each step performs exactly one column of decimal addition, and the carry transfers its overflow to the next column. Continuing while carry remains includes any final digit.

## Edge Cases

- Unequal list lengths treat missing digits as zero. Zero plus zero produces one zero node.

## Complexity

- O(max(list lengths)) time, O(1) auxiliary space, and O(max(list lengths)) result space.
