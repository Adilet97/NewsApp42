package com.example.newsapp42.models;

import java.io.Serializable;

public class Article implements Serializable {
    private String text;
    private long data;

    public Article(String text, long data) {
        this.text = text;
        this.data = data;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public Article(String text) {
        this.text = text;
    }

    public String getText() {
        return null;
    }
}
