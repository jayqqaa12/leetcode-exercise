package com.jayqqaa12.design;

import java.util.*;

/**
 * 实现简易 twitter
 * 难度2星
 */
public class Twitter {

    public class Tweet {
        int id;
        int uid;
        Tweet(int id, int uid) {
            this.id = id;
            this.uid = uid;
        }
    }

    Map<Integer, Set<Integer>> follows = new HashMap<>();
    List<Tweet> tweets = new ArrayList<>();

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        tweets.add(new Tweet(tweetId, userId));
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news
     * feed must be posted by users who the user
     * followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {

        List<Integer> list = new ArrayList<>();
        Set follow = follows.get(userId);

        for (int i = tweets.size()-1; i >=0 ; i--) {
            if(list.size()>=10)break;

            Tweet t = tweets.get(i);
            if ( follow!=null && follow.contains(t.uid) || t.uid == userId )
                list.add(t.id);

        }
        return list;

    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {

        if (!follows.containsKey(followerId)) follows.put(followerId, new HashSet<>());

        follows.get(followerId).add(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {

        if (follows.containsKey(followerId))
        follows.get(followerId).remove(followeeId);

    }



}