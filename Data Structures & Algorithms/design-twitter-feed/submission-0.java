class Twitter {
    Map<Integer, List<int[]>> tweetMap;
    Map<Integer, Set<Integer>> followingMap;
    int timestamp;

    public Twitter() {
        this.tweetMap = new HashMap<>();
        this.followingMap = new HashMap<>();
        this.timestamp = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.computeIfAbsent(userId, k -> new ArrayList<>()).add(new int[]{timestamp++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        Set<Integer> candidates = new HashSet<>(followingMap.getOrDefault(userId, new HashSet<>()));
        candidates.add(userId);
        
        for(Integer user : candidates) {
            List<int[]> tweets = tweetMap.getOrDefault(user, new ArrayList<>());
            for(int[] tweet : tweets) {
                maxHeap.offer(tweet);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        int k = 10;
        while(k > 0 && !maxHeap.isEmpty()) {
            res.add(maxHeap.poll()[1]);
            k--;
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followingMap.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followerId != followeeId) {
            Set<Integer> set = followingMap.getOrDefault(followerId, new HashSet<>());
            set.remove(followeeId);
        }
    }
}