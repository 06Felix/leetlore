## Idea

- Use sell and hold arrays indexed by transaction allowance. For each price, update allowances from k downward: sell from the old holding balance, then hold from the preceding sale allowance.

## Why It Works

- The two transitions represent selling or buying today, with retaining a state covering inactivity. Descending order preserves previous-day values for the smaller allowance, enforcing chronological transactions and never holding more than one share. The kth sale state optimizes at most k transactions.

## Edge Cases

- If prices never rise, zero-initialized sale balances retain the no-trade choice. Holding starts unreachable.

## Complexity

- O(nk) time and O(k) space.

## Notes

- The unlimited-transaction shortcut is commented out; the stored implementation always runs the k-state DP.
