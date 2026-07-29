# Car Pooling

## Idea

- Use a difference array over locations `0..1000`.
- Add passengers at each pickup location and subtract them at each drop-off location.
- Sweep locations in order, maintaining the current passenger count.

## Why It Works

- A trip contributes passengers on every location segment from `from` up to but not including `to`.
- Adding at `from` and subtracting at `to` captures exactly that interval during the prefix sweep.
- If the running passenger count ever exceeds capacity, that point on the route is impossible.

## Edge Cases

- Dropping off and picking up at the same location net correctly through the same difference index.
- Trips are processed independent of input order.
- The fixed array size covers the maximum endpoint from the constraints.

## Complexity

- Time: `O(t + 1001)`, where `t` is `trips.length`.
- Space: `O(1001)`, effectively constant.
