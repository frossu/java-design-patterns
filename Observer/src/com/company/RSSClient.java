package com.company;

import java.util.List;

public class RSSClient implements RSSObserver {
    List<Article> cachedArticles;
    RSSServer rssServer;

    public RSSClient(RSSServer rssServer) {
        this.rssServer = rssServer;
        this.cachedArticles = rssServer.getArticles();
    }

    @Override
    public void update() {
        System.out.println("bg worker: update received");
        this.cachedArticles = rssServer.getArticles();
    }

    public void renderArticles() {
        for (Article article : cachedArticles) {
            System.out.println(article.getName());
            System.out.println(article.getDescription());
            System.out.println(article.getDate());
            System.out.println();
        }
    }
}
