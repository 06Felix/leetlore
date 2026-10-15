# Maximum Number of K-Divisible Components

## Idea

- Build the tree adjacency lists and run postorder DFS from node zero. Return each full subtree sum as long and increment ans whenever that sum is divisible by k.

## Why It Works

- A divisible subtree can be detached without changing the remainder of any ancestor. Counting every such subtree corresponds to greedily cutting all available divisible branches; any valid cut also needs a divisible original subtree sum. The guaranteed divisible total lets the root count the final component.

## Edge Cases

- Zero-valued subtrees can form components. k = 1 permits every node to be separated. A single-node tree contributes one.

## Complexity

- O(n) time and O(n) space for adjacency lists and the worst-case DFS stack.

## Notes

- The DFS retains full sums rather than reducing modulo k; long safely holds them. A chain of 30000 nodes risks StackOverflowError. ans is not reset by the public method, so reusing a Solution instance accumulates earlier results.
