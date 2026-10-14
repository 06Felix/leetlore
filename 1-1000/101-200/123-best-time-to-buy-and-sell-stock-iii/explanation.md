## Idea

- Track four best balances: after the first buy, first sale, second buy, and second sale. Update in reverse transaction order for every price and return the second-sale balance.

## Why It Works

- Each state either retains its previous optimum or advances from the preceding state by buying or selling at today’s price. Reverse update order uses prior-day states. The second-transaction allowance also includes plans with fewer transactions because sale balances begin at zero.

## Edge Cases

- A decreasing series returns zero. Initial holding states forbid selling before any purchase; the nonnegative price bound makes sentinel addition safe.

## Complexity

- O(n) time and O(1) space.
