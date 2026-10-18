# Simple Bank System

## Idea

- Store the supplied balances array. Validate account upper bounds, then implement deposit and withdrawal by direct indexing; transfer first validates both accounts and then performs withdrawal followed by deposit.

## Why It Works

- Under the supplied positive-account and nonnegative-money constraints, a valid withdrawal changes balance only when sufficient funds exist. Validating the destination before withdrawal prevents losing funds on an invalid transfer destination; deposit then completes the transfer.

## Edge Cases

- Zero-money operations succeed for valid accounts. A transfer to the same account restores its original balance. Insufficient funds leave the array unchanged.

## Complexity

- O(1) constructor and transaction time, and O(1) additional space because the balances array is retained by reference.

## Notes

- isValid checks only account <= n, relying on the constraint account >= 1; zero or negative accounts outside that contract can index incorrectly. The supplied balance array is mutated, and the class does not provide concurrency control.
