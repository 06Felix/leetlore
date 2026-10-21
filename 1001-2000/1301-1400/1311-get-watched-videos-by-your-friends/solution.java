class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends,
            int id, int level) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[friends.length];
        Map<String, Integer> ct = new HashMap<>();
        vis[id] = true;
        q.offer(id);
        for (int i = 0; i < level; ++i)
            for (int sz = q.size(); sz > 0; --sz) {
                for (int friend : friends[q.peek()])
                    if (!vis[friend]) {
                        vis[friend] = true;
                        q.offer(friend);
                    }
                q.poll();
            }
        for (int friend : q)
            for (String video : watchedVideos.get(friend))
                ct.merge(video, 1, Integer::sum);
        List<String> ans = new ArrayList<>(ct.keySet());
        ans.sort((a, b) -> ct.get(a).equals(ct.get(b)) ? a.compareTo(b)
                : ct.get(a).compareTo(ct.get(b)));
        return ans;
    }
}
