# Design Movie Rental System

## Idea

- Store each movie copy as one entity. Keep available entities in a TreeSet per movie, rented entities in a global TreeSet, and a packed (shop, movie) map for direct entity lookup. Rent/drop move the entity between sets; search/report take at most five ordered entries.

## Why It Works

- The comparator orders by price, then shop, then movie, satisfying both ranking rules. Per-movie sets contain exactly unrented copies, while the global set contains exactly rented copies; moving the same immutable-ranking entity preserves these invariants.

## Edge Cases

- Unknown movies return an empty search. Tied prices use shop ID, and rented copies additionally use movie ID. Fewer than five results are returned in full.

## Complexity

- O(E log E) worst-case construction, O(log E) rent/drop, and O(log E + 5) conservative search/report iteration time for E copies. Persistent space is O(E).

## Notes

- The 64-bit key allocates separate 32-bit fields for shop and movie, avoiding collisions under the constraints. Rent/drop rely on the guaranteed valid operation sequence; the code does not validate misuse.
