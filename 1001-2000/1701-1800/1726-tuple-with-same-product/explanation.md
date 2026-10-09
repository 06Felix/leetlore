## Idea
- Enumerate unordered index pairs and count how many previous pairs have each product.
- After incrementing a product's count, add eight times its previous count to the answer.

## Why It Works
- Two different pairs with the same product cannot share an element: positive, distinct values would force their other elements to be equal.
- Each matching pair-of-pairs therefore uses four distinct elements and yields eight ordered tuples: two orders within each pair and two orders between pairs.

## Edge Cases
- Fewer than four elements or no repeated products gives zero.
- Each new pair matches all earlier pairs of its product, counting each combination once.

## Complexity
- O(n²) expected time with hash-map updates.
- O(n²) worst-case auxiliary space for distinct pair products.
