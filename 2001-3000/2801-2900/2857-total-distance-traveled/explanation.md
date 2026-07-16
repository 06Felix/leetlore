# Total Distance Traveled

## Idea

- The implementation simulates fuel use recursively.
- If the main tank has at least `5` liters and the additional tank has fuel, it travels `50` km.
- After those `5` liters are consumed, one liter is transferred back, so the recursive call uses `m - 4` and `a - 1`.
- If no transfer is possible, the remaining distance is `m * 10`.

## Why It Works

- Every full block of `5` liters in the main tank produces exactly `50` km.
- A transfer after that block effectively reduces the main tank by only `4` liters net.
- The recursion repeats exactly while another transfer can occur.
- Once the condition fails, all remaining main-tank fuel is consumed normally.

## Edge Cases

- If `mainTank < 5`, no transfer happens.
- If `additionalTank = 0`, the answer is just `mainTank * 10`.
- The constraints are small, so recursive depth is safe.

## Complexity

- Time: $O(t)$, where `t` is the number of transfers.
- Space: $O(t)$ recursion stack.
