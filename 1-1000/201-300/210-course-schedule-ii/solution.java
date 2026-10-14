class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new ArrayList[numCourses];
        int[] inDeg = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            adj[i] = new ArrayList<>();
        for (int[] pre : prerequisites) {
            int child = pre[0];
            int parent = pre[1];
            adj[parent].add(child);
            inDeg[child]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++)
            if (inDeg[i] == 0)
                q.offer(i);
        int[] ans = new int[numCourses];
        int taken = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            ans[taken++] = cur;
            for (int child : adj[cur])
                if (--inDeg[child] == 0)
                    q.offer(child);
        }
        return taken == numCourses ? ans : new int[]{};
    }
}
