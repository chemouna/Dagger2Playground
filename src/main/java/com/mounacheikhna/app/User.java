package com.mounacheikhna.app;

/**
 * Created by m.cheikhna on 24/10/2016.
 */
public class User {

    public String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
