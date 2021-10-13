package com.company;

public interface RSSObservable {
    void registerClient(RSSObserver rssObserver);
    void unregisterClient(RSSObserver rssObserver);
    void notifyAllClients();
}
