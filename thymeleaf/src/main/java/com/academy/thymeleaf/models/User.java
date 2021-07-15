package com.academy.thymeleaf.models;

public class User {
    private String name;
    private int age;
    private String gender;
    private String page;

    public User() {
    }

    public User(String name, int age, String gender, String page) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
