package com.company;

public class Main {
    // RSS feed-ish code example
    public static void main(String[] args) {
        RSSServer server = new RSSServer();
        Article newArticle = new Article(1, "First article", "Some hooking description");
        server.publishArticle(newArticle);

        RSSClient rssClient = new RSSClient(server);

        server.registerClient(rssClient); // updates are pushed only to registered clients

        Article newerArticle = new Article(2, "Second article", "Some hooking description");
        server.publishArticle(newerArticle);

        rssClient.renderArticles();

    }
}
