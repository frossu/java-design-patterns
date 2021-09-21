package com.company;

import java.util.Date;

public class Article {
    private int id;
    private String name;
    private String description;
    private Date date;

    public Article(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}
