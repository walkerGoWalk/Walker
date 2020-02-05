package com.kodilla.testing.forum.statistics;

public class CalculatingStatistics {
    private int usersQuantity = 0;
    private int postsQuantity = 0;
    private int commentsQuantity = 0;
    private double postsPerUser = 0.0;
    private double commentsPerUser = 0.0;
    private double commentsPerPost = 0.0;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if(postsQuantity > 0 && usersQuantity > 0){
            postsPerUser = (double) postsQuantity / usersQuantity;
        }

        if(commentsQuantity > 0 && postsQuantity > 0){
            commentsPerPost = (double) commentsQuantity / postsQuantity;
        }

        if(commentsQuantity > 0 && usersQuantity > 0){
            commentsPerUser = (double) commentsQuantity / usersQuantity;
        }
    }


    public void showStatistics() {
        System.out.println("users quantity  " + usersQuantity); //"\n" перенос строки
        System.out.println("posts quantity: " + postsQuantity);
        System.out.println("comments quantity: " + commentsQuantity);
        System.out.println("posts per user: " + postsPerUser);
        System.out.println("comments per user: " + commentsPerUser);
        System.out.println("comments per post: " + commentsPerPost);
    }

    public int getUsersQuantity() {

        return usersQuantity;
    }

    public int getPostsQuantity() {

        return postsQuantity;
    }

    public int getСommentsQuantity() {

        return commentsQuantity;
    }

    public double getPostsPerUser() {

        return postsPerUser;
    }

    public double getCommentsPerUser() {

        return commentsPerUser;
    }

    public double getCommentsPerPost() {

        return commentsPerPost;
    }
}

