class Tweet {
    public int id, time;
    public Tweet next = null;

    public Tweet(int id, int time) {
        this.id = id;
        this.time = time;
    }
}

class User {
    public int id;
    public Set<Integer> fId = new HashSet<>();
    public Tweet tHead = null;

    public User(int id) {
        this.id = id;
        follow(id);
    }

    public void follow(int id) {
        fId.add(id);
    }

    public void unfollow(int id) {
        fId.remove(id);
    }

    public void post(int tId, int time) {
        Tweet old = tHead;
        tHead = new Tweet(tId, time);
        tHead.next = old;
    }
}

class Twitter {
    private int time = 0;
    private Map<Integer, User> u = new HashMap<>();

    public void postTweet(int userId, int tweetId) {
        u.putIfAbsent(userId, new User(userId));
        u.get(userId).post(tweetId, time++);
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!u.containsKey(userId))
            return new ArrayList<>();
        Queue<Tweet> mh = new PriorityQueue<>((a, b) -> b.time - a.time);
        List<Integer> ans = new ArrayList<>();
        for (int fid : u.get(userId).fId) {
            Tweet hd = u.get(fid).tHead;
            if (hd != null)
                mh.offer(hd);
        }
        int ct = 0;
        while (!mh.isEmpty() && ct++ < 10) {
            Tweet cur = mh.poll();
            ans.add(cur.id);
            if (cur.next != null)
                mh.offer(cur.next);
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId)
            return;
        u.putIfAbsent(followerId, new User(followerId));
        u.putIfAbsent(followeeId, new User(followeeId));
        u.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId)
            return;
        if (u.containsKey(followerId) && u.containsKey(followeeId))
            u.get(followerId).unfollow(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
