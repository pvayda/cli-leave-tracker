package com.galvanize;

public class User {
    private String name;
    private int leaveDays;
    public User(String name){
        this(name, 0);
    }

    public User(String name, int leaveDays) {
        this.name = name;
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
