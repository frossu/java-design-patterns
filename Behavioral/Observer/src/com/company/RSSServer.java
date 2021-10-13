package com.company;

import java.util.ArrayList;
import java.util.List;

public class RSSServer implements RSSObservable {

    List<RSSObserver> rssObservers = new ArrayList<>();
    List<Article> articles = new ArrayList<>();

    public void publishArticle(Article article) {
        articles.add(article);
        notifyAllClients();
    }

    public void unpublishArticle(Article article) {
        articles.remove(article);
        notifyAllClients();
    }

    @Override
    public void registerClient(RSSObserver rssObserver) {
        rssObservers.add(rssObserver);
    }

    @Override
    public void unregisterClient(RSSObserver rssObserver) {
        rssObservers.remove(rssObserver);
    }

    @Override
    public void notifyAllClients() {
        for (RSSObserver rssObserver : rssObservers) {
            rssObserver.update();
        }
    }

    public List<Article> getArticles() {
        return articles;
    }
}
