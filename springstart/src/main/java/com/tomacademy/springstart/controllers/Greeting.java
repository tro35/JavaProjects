package com.tomacademy.springstart.controllers;

public class Greeting {
    protected long id;
    protected String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
