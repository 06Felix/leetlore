# Count Collisions on a Road

## Idea

- Skip the leading L cars and trailing R cars. Count all nonstationary cars in the remaining interval.

## Why It Works

- The skipped cars move away forever. Every moving car inside the remaining interval eventually meets an opposing car or a stationary collision cluster. Each moving car that stops contributes one to the collision count, including two contributions for a head-on collision.

## Edge Cases

- All escaping cars leave an empty counting range. Stationary cars contribute zero, while still blocking other cars.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The implementation counts eventual stopped cars without simulating collision times or changing directions.
