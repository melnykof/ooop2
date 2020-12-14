package ru.netology.domain;

public class Vk {
    private String Information;
    private int Subscribes;
    private int Goods;
    private int likes;
    private String Articles;
    private String wall;
    private String id;
    private String comments;
    private String search;
    private String sharePost;
    private boolean registered;

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public int getSubscribes() {
        return Subscribes;
    }

    public void setSubscribes(int subscribes) {
        Subscribes = subscribes;
    }

    public int getGoods() {
        return Goods;
    }

    public void setGoods(int goods) {
        Goods = goods;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getArticles() {
        return Articles;
    }

    public void setArticles(String articles) {
        Articles = articles;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSharePost() {
        return sharePost;
    }

    public void setSharePost(String sharePost) {
        this.sharePost = sharePost;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}
